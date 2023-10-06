public class Perris {
    private String raza; 
    private String propietario; 
    private int edad;
    private String nombre;
    private Double peso; 
    private int energia; 

    //Constructor; Dar valor inicial a los atributos
    public Perris(String dato1, String dato2, int dato3, String dato4, Double dato5, int dato6){
        raza = dato1; 
        propietario = dato2;
        edad = dato3;
        nombre = dato4;
        peso = dato5;
        energia = dato6;
    }

    public void ImprimirDetalle(){
        System.out.println("+------------------------------------------+");
        System.out.println("| raza: "+raza);
        System.out.println("| Propietario: "+propietario);
        System.out.println("| Edad: "+edad +"mese ("+((double) edad/12)+"anos)");
        System.out.println("| Nombre: "+nombre);
        System.out.println("| Peso: "+peso);
        System.out.println("| Energia: "+energia);
        System.out.println("+------------------------------------------+");
    }



    public String getNombre(){
        return nombre;

    }

    public String getPropietario(){
        return propietario; 
    }

    public int getEdad(){
        return edad; 
    }

    public Double getPeso(){
        return peso; 
    }

    public int getEnergia(){
        return energia;
    }

    public void setNombre(String dato){
        nombre = dato; 
    }

    public void setPeso(Double dato){
        peso = dato; 
    }

    public void setEdad(int dato){
        edad = dato; 
    }

    public void setRaza(String dato){
        raza = dato;
    }

    public void setPropietario(String dato){
        propietario = dato; 
    }

    public void setEnergia(int dato){
        energia = dato; 
    }


    public void comer(int gramos){

        //peso
        peso = peso + ((double) gramos/1000);

        //Energia 
        energia = energia + gramos / 100;

    }
}

