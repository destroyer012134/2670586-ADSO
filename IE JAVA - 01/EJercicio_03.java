import java.util.Scanner;
import java.util.Random;

public class EJercicio_03 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        

        //Se solicita al usuario ingresar el numero del tamaño del arreglo
        System.out.println("Ingrese un numero entero: ");
        int n = teclado.nextInt();


        //Se crea el arreglo del tamaño dado por el usuario y un arreglo del area afectada y uno para el resultado
        int arreglo [] = new int[n];
        int area_afectada [] = new int[n];
        int resultado [] = new int[n];


        //Se solicita al usuarii ingresar la cantidad de bombas
        System.out.println("Ingrese cantidad de bombas que desea: ");
        int cantidad = teclado.nextInt();



        //Bucle para ubicar las bombas aleatoriamente
            for(int i = 0; i < cantidad; i++    ){
                
                int daño = rand.nextInt(n);

                while (arreglo[daño] == 1){
                daño = rand.nextInt(n);
            }

            arreglo[daño] = 1;

            //Bucle para colocar la bomba en la posicion afectada
            for (int m = -1; m <= 1; m++   ){
                if (daño + m >= 0 && daño + m < (n)){
                    area_afectada[daño + m] = 2;
                }

            }
        }

        

        //Se imprime el arreglo con las bobmas y el arreglo con el area afectada.

        for(int i = 0; i < n; i++    ){
            if(arreglo[i] == 1){
                resultado[i] = 1;
            }else{
                resultado[i] = area_afectada[i];
            }

        }


        System.out.println("Arreglo con bombas y area afectada: ");
            for (int i = 0; i < n; i++){
                arreglo [i] = 1;
                System.out.print(resultado[i]+" ");
            } 
    }
}

