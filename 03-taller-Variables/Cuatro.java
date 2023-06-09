import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.println("Valores originales:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

       

        System.out.println("Valores intercambiados:");
        System.out.println("Número 1: " + numero2);
        System.out.println("Número 2: " + numero1);

    }
    
}
