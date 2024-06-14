<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) && !empty($_POST['descripcion']) && !empty($_POST['estado']) && !empty($_POST['fecha_inicio']) && !empty($_POST['fecha_fin']) && !empty($_POST['proyecto_id'])) {

        $nombre = $_POST['nombre'];
        $descripcion = $_POST['descripcion'];
        $estado = $_POST['estado'];
        $fecha_inicio = $_POST['fecha_inicio'];
        $fecha_fin = $_POST['fecha_fin'];
        $proyecto_id = $_POST['proyecto_id'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO tareas (nombre, descripcion, estado, fecha_inicio, fecha_fin, proyecto_id) VALUES(:nom, :des, :est, :fecha_inicio, :fecha_fin, :proyecto_id)");
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':des', $descripcion);
            $consulta->bindParam(':est', $estado);
            $consulta->bindParam(':fecha_inicio', $fecha_inicio);
            $consulta->bindParam(':fecha_fin', $fecha_fin);
            $consulta->bindParam(':proyecto_id', $proyecto_id);
            $proceso = $consulta->execute();

            if ($proceso && $consulta->rowCount() != 0) {
                $respuesta = [
                                'status' => true,
                                'message' => "OK##TAREA##INSERT"
                            ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                                'status' => false,
                                'message' => "ERROR##TAREA##INSERT"
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
