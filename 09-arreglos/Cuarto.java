import java.util.Scanner;
import java.util.Random;
public class Cuarto {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros para el arreglo: ");
        int n = teclado.nextInt();

        int arreglo [] = new int[n];
        Random rand = new Random();
        

        for (int i = 0; i < n; i++   ){
            arreglo[i] = rand.nextInt(100);
            System.out.println("Estos son los numeros aleatorios: "+arreglo[i]);


        }

        int min = arreglo[0];

        for(int i = 1; i < n; i++    ){
            if(arreglo[i] < min){
                min = arreglo[i];


            }
            

        }

      System.out.println("El numero menor es: "+min);

        


    }
}
