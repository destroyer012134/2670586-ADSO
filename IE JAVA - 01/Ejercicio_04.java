import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);


        //Se crea la tabla de distancias
        double[][] tabla_distancias = {
            {5.0, 81.7, 53.6, 99.8, 70.4},
            {81.5, 5.0, 103.0, 103.0, 34.3},
            {57.9, 103.0, 5.0, 83.2, 109.0},
            {98.5, 102.0, 83.5, 5.0, 75.2},
            {70.5, 34.5, 109.0, 76.4, 5.0}
            };


        System.out.println("Calculadora de consumo de combustible.");
        
        //Se le pide al usuario los datos: Ciuda de origen y cantidad de paradas
        System.out.println("Ingrese la ciudad de origen: ");
        String ciudad_orgi = texto.nextLine();

        System.out.println("Ingrese la cantidad de paradas: ");
        int paradas = teclado.nextInt();


        //Se crea el arreglo donde se almacenan la cantidad de paradas
        String arreglo_paradas [] = new String[paradas];

        //Bucle que almacena las paradas
        for(int i = 0; i < paradas; i++   ){
            System.out.println("Ingrese la parada numero: "+i+" ");
            arreglo_paradas[i] = texto.nextLine();

        }

        double distanciatotal = 0.0;
        int indciudadorigen = 0;

        switch(ciudad_orgi){
            case "MISTRATO":
                indciudadorigen = 0;
                break;
            case "PUEBLO RICO":
                indciudadorigen = 1;
                break;
            case "QUINCHIA":
                indciudadorigen = 2;
                break;
            case "SANTA ROSA DE CABAL":
                indciudadorigen = 3;
                break;
            case "SANTUARIO":
                indciudadorigen = 4;
                break;
            
        }

        int indiceCiudad = 0;

        for(String ciudad : arreglo_paradas){
            
            switch (ciudad) {
                case "MISTRATO":
                    indiceCiudad = 0;
                    break;
                case "PUEBLO RICO":
                    indiceCiudad = 1;
                    break;
                case "QUINCHIA":
                    indiceCiudad = 2;
                    break;
                case "SANTA ROSA DE CABAL":
                    indiceCiudad = 3;
                    break;
                case "SANTUARIO":
                    indiceCiudad = 4;
                    break;


        }


        }
        
        distanciatotal += tabla_distancias[indciudadorigen][indiceCiudad];
        indciudadorigen = indiceCiudad;

        double consumoProm = 10.0; 
        double consumoGasolina = distanciatotal / consumoProm;

        double costo_litro = 7.474;
        double costoGasolina = consumoGasolina * costo_litro;

        System.out.println("La distancia total es: "+distanciatotal+" km ");
        System.out.println("El consumo de gasolina es: "+consumoGasolina+" listros");
        System.out.println("El costo de la gasolina es: "+costoGasolina+" pesos colombianos ");



    }

}