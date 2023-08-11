import java.util.Random;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero con el que desea llenar el arreglo: ");
        int n = teclado.nextInt();

        int arreglo [] = new int [n];
        Random rand = new Random();
        int multiplicacion = 1;

        for(int i = 0; i < n; i++    ){
         arreglo[i] = rand.nextInt(100);
         System.out.println(arreglo[i]);
         multiplicacion *= arreglo[i];


        }

        System.out.println("El producto de los numeros es: "+multiplicacion);

        

        
    }
}
