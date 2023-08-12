import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);


        //Se le pide al usuario que ingrese el tamaño para el arreglo: 
        System.out.println("Ingrese el tamaño que desea para el arreglo: ");
        int n = teclado.nextInt();


        //Se crea la matriz
        int [] [] matriz = new int[n] [n];

        //Contador para tener en cuenta los numeros que se van agregando
        int contador = 1;


        //Bucle para correr las filas de la cuadricula: 
        for(int i = 0; i < n; i++){
            if (i % 2 == 0){
                for(int m = 0; m < n; m++    ){
                    matriz[i] [m] = contador++;

                }
            }else{
                for(int m = n - 1; m >= 0; m--    ){
                    matriz[i] [m] = contador++;


                }
            }

        }

        //Imprimir cuadricula en zig zag.
        System.out.println("Cuadricula en zig zag: ");
        for (int i = 0; i < n; i++) {
            for (int m = 0; m < n; m++) {
                System.out.print("["+matriz[i][m]+"]");
            }
            System.out.println();

        }
    }

}
