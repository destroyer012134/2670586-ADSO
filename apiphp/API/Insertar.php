<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['descripcion']) and !empty($_POST['fecha_inicio']) and !empty($_POST['fecha_fin'])) {

        $nombre = $_POST['nombre'];
        $descripcion = $_POST['descripcion'];
        $fecha_inicio = $_POST['fecha_inicio'];
        $fecha_fin = $_POST['fecha_fin'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO proyectos (nombre, descripcion, fecha_inicio, fecha_fin) VALUES(:nom, :des, :fecha_inicio, :fecha_fin)");
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':des', $descripcion);
            $consulta->bindParam(':fecha_inicio', $fecha_inicio);
            $consulta->bindParam(':fecha_fin', $fecha_fin);
            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = [
                                'status' => true,
                                'message' => "OK##PROYECTO##INSERT"
                            ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                                'status' => false,
                                'message' => "ERROR##PROYECTO##INSERT"
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
