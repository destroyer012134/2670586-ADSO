import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Tercero {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un numero con el que desea llenar el arreglo: ");
        int n = teclado.nextInt();

        int arreglo [] = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++   ){
        
            arreglo[i] = rand.nextInt(100);
            System.out.println("Numeros del arreglo: "+arreglo[i]);;
            
        }

            Arrays.sort(arreglo);
            int numeromax = arreglo[arreglo.length-1];
            System.out.println("Numero mayor: "+numeromax);
        
    }
}
