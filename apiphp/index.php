<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Una API para la gestión de proyectos y tareas, donde se pueden realizar las acciones de obtener, insertar, actualizar y eliminar.">
    <title>API de Gestión de Proyectos</title>
    <link rel="icon" type="image/x-icon" href="WEB/img/icono_api.png">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4 text-center" >API de Gestión de Proyectos</h1>
        <div class="row">
            <div class="col-md-6">
                <h2>Proyectos</h2>
                <ul id="endpoint-list" class="list-group">
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/Obtener.php">API/ObtenerProyectos.php</a></h4>
                        <h5>Método: GET</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li>Ninguno</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>[{"id":1,"nombre":"Proyecto Alpha","descripcion":"Descripción del Proyecto Alpha","fecha_inicio":"2024-06-01","fecha_fin":"2024-12-01"},{"id":2,"nombre":"Proyecto Beta","descripcion":"Descripción del Proyecto Beta","fecha_inicio":"2024-07-01","fecha_fin":"2024-11-01"}]</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/Insertar.php">API/InsertarProyecto.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>String</b> nombre</li>
                            <li><b>String</b> descripcion</li>
                            <li><b>Date</b> fecha_inicio</li>
                            <li><b>Date</b> fecha_fin</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##PROYECTO##INSERT"}</pre>
                        <pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##PROYECTO##INSERT"}</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/Actualizar.php">API/ActualizarProyecto.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>int</b> id</li>
                            <li><b>String</b> nombre</li>
                            <li><b>String</b> descripcion</li>
                            <li><b>Date</b> fecha_inicio</li>
                            <li><b>Date</b> fecha_fin</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##PROYECTO##UPDATE"}</pre>
                        <pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##PROYECTO##UPDATE"}</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/Eliminar.php">API/EliminarProyecto.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>int</b> id</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##DELETE"}</pre>
                        <pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##DELETE"}</pre>
                    </li>
                </ul>
            </div>
            <div class="col-md-6">
                <h2>Tareas</h2>
                <ul id="endpoint-list" class="list-group">
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/ObtenerTareas.php">API/ObtenerTareas.php</a></h4>
                        <h5>Método: GET</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>int</b> proyecto_id</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>[{"id":1,"nombre":"Tarea 1 de Alpha","descripcion":"Descripción de la Tarea 1 del Proyecto Alpha","estado":"En progreso","fecha_inicio":"2024-06-05","fecha_fin":"2024-06-20","proyecto_id":1},{"id":2,"nombre":"Tarea 2 de Alpha","descripcion":"Descripción de la Tarea 2 del Proyecto Alpha","estado":"Pendiente","fecha_inicio":"2024-06-21","fecha_fin":"2024-07-05","proyecto_id":1},{"id":3,"nombre":"Tarea 1 de Beta","descripcion":"Descripción de la Tarea 1 del Proyecto Beta","estado":"Completada","fecha_inicio":"2024-07-05","fecha_fin":"2024-07-20","proyecto_id":2},{"id":4,"nombre":"Tarea 2 de Beta","descripcion":"Descripción de la Tarea 2 del Proyecto Beta","estado":"En progreso","fecha_inicio":"2024-07-21","fecha_fin":"2024-08-05","proyecto_id":2}]</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/InsertarTareas.php">API/InsertarTarea.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>String</b> nombre</li>
                            <li><b>String</b> descripcion</li>
                            <li><b>String</b> estado</li>
                            <li><b>Date</b> fecha_inicio</li>
                            <li><b>Date</b> fecha_fin</li>
                            <li><b>int</b> proyecto_id</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##TAREA##INSERT"}</pre>
                        <pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##TAREA##INSERT"}</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/ActualizarTareas.php">API/ActualizarTarea.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>int</b> id</li>
                            <li><b>String</b> nombre</li>
                            <li><b>String</b> descripcion</li>
                            <li><b>String</b> estado</li>
                            <li><b>Date</b> fecha_inicio</li>
                            <li><b>Date</b> fecha_fin</li>
                            <li><b>int</b> proyecto_id</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##TAREA##UPDATE"}</pre>
                        <pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##TAREA##UPDATE"}</pre>
                    </li>
                    <li class="list-group-item">
                        <h4>EndPoint: <a href="./API/EliminarTareas.php">API/EliminarTarea.php</a></h4>
                        <h5>Método: POST</h5>
                        <h5>Parámetros:</h5>
                        <ul class="list-unstyled">
                            <li><b>int</b> id</li>
                        </ul>
                        <h5>Salida: JSON</h5>
                        <pre>{"status":true,"message":"OK##DELETE"}</pre>
						<pre>{"status":false,"message":"ERROR##DATOS##POST"}</pre>
                        <pre>{"status":false,"message":"ERROR##DELETE"}</pre>
							
