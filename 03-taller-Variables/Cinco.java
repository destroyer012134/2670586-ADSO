import java.util.Scanner;

public class Cinco {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        Double B, A;
    

        System.out.println("Ingrese la base del triangulo: ");
        B = teclado.nextDouble();

        System.out.println("Ingrese altura del triangulo: ");
        A = teclado.nextDouble();

        Double resultado =  (B * A) / 2;

        System.out.println("El area del triangulo es: "+resultado);


    }
}
