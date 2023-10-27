public class Curso {
    //Atributos;
    public int codigo; 
    public  String nombre ;
    public  String Area_Conocimiento;
    public  int Duracion;
    public int numTemas;

    //Constructor; Dar valor inicial a los atributos
    public Curso(int codigo, String nombre, String Area_Conocimiento, int duracion, int numTemas ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Area_Conocimiento = Area_Conocimiento;
        this.Duracion = duracion;
        this.numTemas = numTemas;
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

    public int getTemas(){
        return numTemas;
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

    public void setTemas(int dato){
        numTemas = dato;
        
    }

    public void ImprimirDetalle(){
        System.out.println("---------------------------------");
        System.out.println("Lista de todos los cursos:");
        System.out.println("---------------------------------");
        System.out.println("+------------------------------------------+");
        System.out.println("| codigo: "+codigo);
        System.out.println("| nombre: "+nombre);
        System.out.println("| Area de conocimiento: "+Area_Conocimiento);
        System.out.println("| Duracion: "+Duracion+" hrs");
        System.out.println("| Temas: "+numTemas);
        System.out.println("+------------------------------------------+");


    }

    //metodo de editar infomracion 
    public void editarInfo(String nombre, String Area_Conocimiento, int Duracion){
        this.nombre = nombre;
        this.Area_Conocimiento = Area_Conocimiento;
        this.Duracion = Duracion;

    }

    //metodo de temas
    public void agregarTema(int tema) {
        if (numTemas < 15) {
            numTemas = tema;
            numTemas++;
        } else {
            System.out.println("maximo de temas alcanzado.");
        }
    }


    
}
