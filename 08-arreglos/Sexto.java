import java.util.Scanner;

public class Sexto {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese tamaño del arreglo: ");
        int tamaño = teclado.nextInt();

        int arreglo [] = new int[tamaño];
        

        for (int i = 0; i < arreglo.length; i++   ){

            System.out.println("Ingrese datos con los cuales desea llenar el arreglo: ");
            arreglo[i] = teclado.nextInt();

        }

        System.out.println("Los números primos en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            if (esPrimo(arreglo[i])) {
                System.out.println(arreglo[i]);
            }
        }
        System.out.println("Los números no primos en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            if (!esPrimo(arreglo[i])) {
                System.out.println(arreglo[i]);
            }
        }
    }





            public static boolean esPrimo(int numero) {
                if (numero <= 1) {
                    return false;
                }
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
                return true;
        

        }
    }



