<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id'])) {
        
        $proyecto_id = $_POST['id'];
        
        try {
            $consulta = $base_de_datos->prepare("DELETE FROM proyectos WHERE id = :id");
            $consulta->bindParam(':id', $proyecto_id);
            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = [
                                'status' => true,
                                'message' => "OK##DELETE"
                            ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                                'status' => false,
                                'message' => "ERROR##DELETE"
                            ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'message' => "ERROR##SQL",
                            'exception' => $e->getMessage()
                          ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
                        'status' => false,
                        'message' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
