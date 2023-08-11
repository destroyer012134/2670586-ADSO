import java.util.Random;
import java.util.Scanner;


public class Quinto {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = teclado.nextInt();


        float[] arreglo = new float[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextFloat() * 100;
            System.out.println("Los numeros de arreglo son: "+arreglo[i]);

        }


        float suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }


        float promedio = suma / n;
        System.out.println("El promedio de todos los elementos del arreglo es: " + promedio);
    }
}
