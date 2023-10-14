public class Curso {
    //Atributos;
    int codigo; 
    String nombre ;
    String Area_Conocimiento;
    int Duracion;
    String [] temas = new String[15];
    int numTemas;

    //Constructor; Dar valor inicial a los atributos
    public Curso(int codigo, String nombre, String Area_Conocimiento, int duracion, int numTemas ){
        
        codigo = codigo;
        nombre = nombre;
        Area_Conocimiento = Area_Conocimiento;
        Duracion = duracion;
        numTemas = 0;
    }

    //getters
    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    
    public String getArea(){
        return Area_Conocimiento;
    }

    public int getDuracion(){
        return Duracion;
    }

    public String [] getTemas(){
        return temas;
    }

    //setters

    public void setCodigo(int dato){
        codigo = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setArea(String dato){
        Area_Conocimiento = dato;
    }

    public void setDuracion(int dato){
        Duracion = dato;
    }

    public void setTemas(String [] dato){
        temas = dato;
        
    }

    public void ImprimirDetalle(){
        System.out.println("+------------------------------------------+");
        System.out.println("| codigo: "+codigo);
        System.out.println("| nombre: "+nombre);
        System.out.println("| Area de conocimiento: "+Area_Conocimiento);
        System.out.println("| Duracion: "+Duracion);
        System.out.println("| Temas: "+temas);
        System.out.println("+------------------------------------------+");


    }

    //metodo de editar infomracion 
    public void editarInfo(String nombre, String Area_Conocimiento, int Duracion){
        this.nombre = nombre;
        this.Area_Conocimiento = Area_Conocimiento;
        this.Duracion = Duracion;

    }

    //metodo de temas
    public void agregarTema(String tema) {
        if (numTemas < 15) {
            temas[numTemas] = tema;
            numTemas++;
        } else {
            System.out.println("maximo de temas alcanzado.");
        }
    }


    
}
