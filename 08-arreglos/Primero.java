import java.util.Scanner;

public class Primero {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("=> Ingrese un numero ");
        int numero = teclado.nextInt();

        int arreglo [] = new int[numero];

        for ( int i = 0; i < arreglo.length; i++ ){
            arreglo[i] = (i+1) * 2 - 1;

        }

        for ( int i = 0; i < arreglo.length; i++){
            System.out.println("Valor pos "+i+" es: "+arreglo[i]);
        }
    }
    
}
