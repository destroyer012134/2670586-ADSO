import java.util.Scanner;

public class Doce {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if(numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El numero SI es divisible por 2, 3 y 5.");

        }else{
            System.out.println("El numero NO es divisible por 2, 3 y 5.");
        }

    }
} 
