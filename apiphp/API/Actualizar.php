<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id']) && !empty($_POST['nombre']) && !empty($_POST['descripcion']) && !empty($_POST['fecha_inicio']) && !empty($_POST['fecha_fin'])) {
        
        $proyecto_id = $_POST['id'];
        $nombre = $_POST['nombre'];
        $descripcion = $_POST['descripcion'];
        $fecha_inicio = $_POST['fecha_inicio'];
        $fecha_fin = $_POST['fecha_fin'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE proyectos SET nombre = :nom, descripcion = :des, fecha_inicio = :fecha_inicio, fecha_fin = :fecha_fin WHERE id = :id");
            $consulta->bindParam(':id', $proyecto_id);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':des', $descripcion);
            $consulta->bindParam(':fecha_inicio', $fecha_inicio);
            $consulta->bindParam(':fecha_fin', $fecha_fin);
            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = [
                                'status' => true,
                                'message' => "OK##PROYECTO##UPDATE"
                            ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                                'status' => false,
                                'message' => "ERROR##PROYECTO##UPDATE"
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
