import java.util.Scanner;

public class Segundo {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese un número de tres dígitos: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es: Par.");
        } else {
            System.out.println("El número ingresado es: Impar.");
        }
    }
}
