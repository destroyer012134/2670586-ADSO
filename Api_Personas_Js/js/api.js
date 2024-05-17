



window.onload = function(){
    lista_gente = document.getElementById("lista_personas");
}

        function listarpersonas(){
            fetch("https://codetesthub.com/API/Obtener.php")
            .then(res=> res.json())
            .then(data => {
                console.log('Respuesta JSON: ');
                console.log(data);
                mostrarpersonas(data);
            })
        }

        function mostrarpersonas(data){
            lista_gente.innerHTML = '';
            
            for (let i = 0; i < data.length; i++) {
                const persona = data[i];
                const listahijo = document.createElement("li");
                listahijo.innerHTML = `
                    <h2>USUARIO</h2>
                    <p>Cédula: ${persona.cedula}</p>
                    <p>Nombre completo: ${persona.nombres} ${persona.apellidos}</p>
                    <p>Teléfono: ${persona.telefono}</p>
                    <p>Dirección: ${persona.direccion}</p>
                    <p>Email: ${persona.email}</p>
                    <div class="btn btn-outline-primary text center">
                    EDITAR
                    </div>
                    <div class="btn btn-outline-danger">
                    ELIMINAR
                    </div>
                `;
                lista_gente.appendChild(listahijo);
            }
        }


        function insertarpersona(){
            let datos = new FormData();

    let cedula = document.getElementById("cedula").value;
    let nombres = document.getElementById("nombres").value;
    let apellidos = document.getElementById("apellidos").value;
    let telefono = document.getElementById("telefono").value;
    let direccion = document.getElementById("direccion").value;
    let email = document.getElementById("email").value;

    
    let configuracion = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
       datos,
    };


            fetch("https://codetesthub.com/API/Insertar.php")
            .then(res=> res.json())
            .then(data => {
                console.log('Respuesta JSON: ');
                console.log(data);
                mostrarpersonas(data);
            })
        }


        
        function actualizarPersona(){
            let datos = new FormData();
            datos.append("cedula", 108802);
            datos.append("nombres", "NUEVO DATO");
            datos.append("cedula", "NUEVO DATO");
            datos.append("cedula", "NUEVO DATO");
            datos.append("cedula", "NUEVO DATO");

    let cedula = document.getElementById("cedula").value;
    let nombres = document.getElementById("nombres").value;
    let apellidos = document.getElementById("apellidos").value;
    let telefono = document.getElementById("telefono").value;
    let direccion = document.getElementById("direccion").value;
    let email = document.getElementById("email").value;

    let configuracion = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: dato,
    };


            fetch("https://codetesthub.com/API/Insertar.php")
            .then(res=> res.json())
            .then(data => {
                console.log('Respuesta JSON: ');
                console.log(data);
                mostrarpersonas(data);
            })
        }


        function EliminarPersona() {
    
            let endpoint = ("https://codetesthub.com/API/Eliminar.php");
            let datos = new FormData();
            
            datos.append("cedula",  2222);
           
            
            let configuracion = {
                method: "POST",
                Headers: {
                    "Accept": "application/json",
                },
                body: datos,
        
            };
           
            fetch(endpoint , configuracion)
            .then(respuesta => respuesta.json())
            .then(data => {
                
                contenPrincipal.innerHTML = "";
                console.log('respuesta JSON:');
                console.log(data);
        
                cargarPersonas();
                 
                
            });
        }