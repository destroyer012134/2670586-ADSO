let contentPrincipal;
let pokeimg;
let nombrepokemon;
let siguientePagina = "";
let anteriorPagina = "";
let gifCargando;

window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");
    pokeimg = document.getElementById("pokeimg");
    nombrepokemon = document.getElementById("nombrepoke");
    gifCargando = document.getElementById("gif_cargando"); 
    consumoAPI();
}

function mostrarCargando() {
    gifCargando.style.display = "block"; 
}

function ocultarCargando() {
    gifCargando.style.display = "none"; 
}

function consumoAPI(endpoint = "https://pokeapi.co/api/v2/pokemon") {
    mostrarCargando(); 

    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        ocultarCargando();
        contentPrincipal.innerHTML = "";
        for (let i = 0; i < data.results.length; i++) {
            let html_temp = `<div class="col-md-4">
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12">${data.results[i].name}</button>
                            </div>`;
            contentPrincipal.innerHTML += html_temp;

        }

        siguientePagina = data.next;
        anteriorPagina = data.previous;
    });
}

function btnSiguiente(){
    if(siguientePagina){
        mostrarCargando(); 
        consumoAPI(siguientePagina); 
    }
}

function btnAnterior(){
    if(anteriorPagina){
        mostrarCargando(); 
        consumoAPI(anteriorPagina); 
    }
}

function cargarDetalle(endpoint){

    mostrarCargando();
    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        ocultarCargando();
        nombrepokemon.textContent = data.name;
        pokeimg.src = data.sprites.other.dream_world.front_default;

    });

}
