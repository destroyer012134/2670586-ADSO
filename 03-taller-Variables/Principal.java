import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int num1, num2, suma;

        System.out.println("Ingrese primer numero");
        num1 = teclado.nextInt();

        System.out.println("Ingrese segundo numero");
        num2 = teclado.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de la suma es: "+suma);

        

        
        
    }
}