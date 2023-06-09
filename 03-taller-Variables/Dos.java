import java.util.Scanner;

public class Dos {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        double C,F;

        System.out.println("Ingrese grados en celsius: ");
        C = teclado.nextDouble();

        F = (C * 9/5) + 32;

        System.out.println("Los grados en Fahrenheit son: "+F);



    }
}
