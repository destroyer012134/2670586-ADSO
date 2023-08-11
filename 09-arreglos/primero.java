import java.util.Random;
import java.util.Scanner;

public class Primero {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese tamaño del arreglo: ");
        int n = teclado.nextInt();

        int arreglo [] = new int[n];
        Random rand = new Random();
        int suma = 0;
        System.out.println("Los números aleatorios en el arreglo son:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
            System.out.println(arreglo[i]);
            suma += arreglo[i];
        }
        System.out.println("La suma de todos los elementos del arreglo es: " + suma);
    }


}

