window.onload = function() {
    listaProyectos = document.getElementById("lista_proyectos");
    listaTareas = document.getElementById("lista_tareas");
}

// Función para listar proyectos
function listarProyectos() {
    fetch("http://localhost/apiphp/API/Obtener.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON: ');
        console.log(data);
        mostrarProyectos(data);
        listaProyectos.classList.add("scrollable-list");
    })
    .catch(error => console.error('Error:', error));
}

function mostrarProyectos(data) {
    listaProyectos.innerHTML = '';
    for (let i = 0; i < data.length; i++) {
        const proyecto = data[i];
        const listahijo = document.createElement("li");
        listahijo.classList.add("list-group-item");
        listahijo.innerHTML = `
            <h2>PROYECTO</h2>
            <p>ID: ${proyecto.id}</p>
            <p>Nombre: ${proyecto.nombre}</p>
            <p>Descripción: ${proyecto.descripcion}</p>
            <p>Fecha Inicio: ${proyecto.fecha_inicio}</p>
            <p>Fecha Fin: ${proyecto.fecha_fin}</p>
        `;
        listaProyectos.appendChild(listahijo);
    }
}

// Función para listar tareas
function listarTareas() {
    fetch("http://localhost/apiphp/API/ObtenerTareas.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON: ');
        console.log(data);
        mostrarTareas(data);
        listaTareas.classList.add("scrollable-list");
    })
    .catch(error => console.error('Error:', error));
}

function mostrarTareas(data) {
    listaTareas.innerHTML = '';
    for (let i = 0; i < data.length; i++) {
        const tarea = data[i];
        const listahijo = document.createElement("li");
        listahijo.classList.add("list-group-item");
        listahijo.innerHTML = `
            <h2>TAREA</h2>
            <p>ID: ${tarea.id}</p>
            <p>Nombre: ${tarea.nombre}</p>
            <p>Descripción: ${tarea.descripcion}</p>
            <p>Estado: ${tarea.estado}</p>
            <p>Fecha Inicio: ${tarea.fecha_inicio}</p>
            <p>Fecha Fin: ${tarea.fecha_fin}</p>
            <p>ID Proyecto: ${tarea.proyecto_id}</p>

        `;
        listaTareas.appendChild(listahijo);
    }
}


// Funciones para insertar proyectos
function insertarProyecto() {
    const nombre = document.getElementById('nombre-proyecto').value;
    const descripcion = document.getElementById('descripcion-proyecto').value;
    const fechaInicio = document.getElementById('fecha-inicio-proyecto').value;
    const fechaFin = document.getElementById('fecha-fin-proyecto').value;

    fetch('http://localhost/apiphp/API/Insertar.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `nombre=${nombre}&descripcion=${descripcion}&fecha_inicio=${fechaInicio}&fecha_fin=${fechaFin}`
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarProyectos();
            $('#modalInsertarProyecto').modal('hide');
        }
    })
}


// Funciones para insertar tareas
function insertarTarea() {
    const nombre = document.getElementById('nombre-tarea').value;
    const descripcion = document.getElementById('descripcion-tarea').value;
    const estado = document.getElementById('estado-tarea').value;
    const fechaInicio = document.getElementById('fecha-inicio-tarea').value;
    const fechaFin = document.getElementById('fecha-fin-tarea').value;
    const proyectoId = document.getElementById('proyecto-id-tarea').value;

    fetch('http://localhost/apiphp/API/InsertarTareas.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `nombre=${nombre}&descripcion=${descripcion}&estado=${estado}&fecha_inicio=${fechaInicio}&fecha_fin=${fechaFin}&proyecto_id=${proyectoId}`
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarTareas();
            $('#modalInsertarTarea').modal('hide');
        }
    })
}


function actualizarProyecto() {
    const id = document.getElementById('id-proyecto').value;
    const nombre = document.getElementById('nombre-proyecto-actualizar').value;
    const descripcion = document.getElementById('descripcion-proyecto-actualizar').value;
    const fechaInicio = document.getElementById('fecha-inicio-proyecto-actualizar').value;
    const fechaFin = document.getElementById('fecha-fin-proyecto-actualizar').value;

    const body = `id=${id}&nombre=${nombre}&descripcion=${descripcion}&fecha_inicio=${fechaInicio}&fecha_fin=${fechaFin}`;

    fetch('http://localhost/apiphp/API/Actualizar.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: body
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarProyectos();
            $('#modalActualizarProyecto').modal('hide');
        }
    })
}







// Funciones para actualizar tareas
function actualizarTarea() {
    const id = document.getElementById('id-tarea').value;
    const nombre = document.getElementById('nombre-tarea-actualizar').value;
    const descripcion = document.getElementById('descripcion-tarea-actualizar').value;
    const estado = document.getElementById('estado-tarea-actualizar').value;
    const fechaInicio = document.getElementById('fecha-inicio-tarea-actualizar').value;
    const fechaFin = document.getElementById('fecha-fin-tarea-actualizar').value;
    const proyectoId = document.getElementById('proyecto-id-tarea-actualizar').value;

    const body = `id=${id}&nombre=${nombre}&descripcion=${descripcion}&estado=${estado}&fecha_inicio=${fechaInicio}&fecha_fin=${fechaFin}&proyecto_id=${proyectoId}`;

    fetch('http://localhost/apiphp/API/ActualizarTareas.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: body
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarTareas();
            $('#modalActualizarTarea').modal('hide');
        }
    })
}




function eliminarTarea() {
    const id = document.getElementById('id-tarea-eliminar').value;

    const body = `id=${encodeURIComponent(id)}`;

    fetch('http://localhost/apiphp/API/EliminarTareas.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: body
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarTareas();
            $('#modalEliminarTarea').modal('hide');
        }
    })
}


// Funciones para eliminar proyectos
function eliminarProyecto() {
    const id = document.getElementById('id-proyecto-eliminar').value;

    const body = `id=${encodeURIComponent(id)}`;

    fetch('http://localhost/apiphp/API/Eliminar.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: body
    })
    .then(res => res.json())
    .then(data => {
        alert(data.message);
        if (data.status) {
            listarProyectos();
            $('#modalEliminarProyecto').modal('hide');
        }
    })
}

