public class Equipos {
    //atributos
    String nombre; 
    int an_fundacion;
    int cantidad_ganados;
    int cantidad_empate;
    int cantidad_perdidos;
    Jugador [] lista_jugador = new Jugador[25];


    //constructor
    public Equipos(String nombre, int an_fundacion, int cantidad_ganados, int cantidad_empate, int cantidad_perdidos, Jugador [] listaJugador){
        this.nombre = nombre;
        this.an_fundacion = an_fundacion;
        this.cantidad_ganados = 0;
        this.cantidad_empate = 0; 
        this.cantidad_perdidos = 0;
        this.lista_jugador = listaJugador;

    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getAnfundacion(){
        return an_fundacion;
    }

    public int getGanados(){
        return cantidad_ganados;
    }

    public int getEmpate(){
        return cantidad_empate;

    }

    public int getPerdidos(){
        return cantidad_perdidos;
    }

    //Setters
    public void setNombre(String dato){
        nombre = dato;

    }

    public void setAnfundacion(int dato){
        an_fundacion = dato;
    }

    public void setGanadso(int dato){
        cantidad_ganados = dato;

    }

    public void setPerdidos(int dato){
        cantidad_perdidos = dato;
    }

    public void setEmpate(int dato){
        cantidad_empate = dato;
    }

    //METODOS
    public void 

}