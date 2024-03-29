public class Perris {
    public String raza; 
    public String propietario; 
    public int edad;
    public String nombre;
    public Double peso; 
    public int energia; 

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

    public void jugar(int intensidad) {
        //Para que la intensidad sea del 1 al 10
        if (intensidad < 1) {
            intensidad = 1;
        } else if (intensidad > 10) {
            intensidad = 10;
        }
    
        // calcular la disminución del peso en funcion de la intensidad
        double ejercicio = 0.002 * intensidad * peso;  // Ajusta el factor según sea necesario
    
        // Reducir la energia del perro en funcion de la intensidad
        energia = energia - (intensidad * 2);  // Ajusta la fórmula según sea necesario
    
        // Reducir el peso del perro en funcion del ejercicio
        peso = peso - ejercicio;
    
        // Asegúrate de que el peso y la energia no sean valores negativos
        if (peso < 0) {
            peso = 0.0;
        }
        if (energia < 0) {
            energia = 0;
        }
    }
    



    public void dormir(int horas) {
        // Aumentar la energia en funcion de las horas de sueño
        energia = energia + horas * 10;
        
        // Aumentar un poco el peso durante el sueño
        peso = peso + 0.1 * horas;

        if (energia <= 100){
            energia = 100;
        }
    }


    public void hacerPopis() {
        // Reducir el peso en funcion de la cantidad de "popis" realizados
        peso = peso - 0.1;
    
    }

    
    public void caminar(int minutos) {
        // Reducir el peso y la energia en funcion de la duracion de la caminata
        if (minutos <= 30) {
            // Caminata ligera
            peso = peso - 0.05;
            energia = energia - minutos * 2;
        } else if (minutos <= 60) {
            // Caminata moderada
            peso = peso - 0.1;
            energia = energia - minutos * 3;
        } else {
            // Caminata intensa
            peso = peso - 0.15;
            energia = energia - minutos * 4;
        }

        if (peso < 0) {
            peso = 0.0;
        }
        if (energia < 0) {
            energia = 0;
        }
        
    }
    
    
    
}



