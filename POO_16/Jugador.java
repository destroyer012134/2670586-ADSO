public class Jugador {
    //Atributos
    int cedula;
    String nombre;
    int edad;
    String posicion;

    //constructor
    public Jugador(int cedula, String nombre, int edad, String posicion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;

    }

    //getters
    public int getCedula(int cedula){
        return cedula;
    }

    public String getNombre(String nombre){
        return nombre;
    }

    public int getEdad(int edad){
        return edad;
    }

    public String getPosicion(String posicion){
        return posicion;
    }

    //setters
    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setPosicion(String dato){
        posicion = dato;
    }


    
}
