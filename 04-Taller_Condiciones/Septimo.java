import java.util.Scanner;

public class Septimo{
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese un número (máximo 10 dígitos e inferior a 2.000 millones): ");
        long numero = teclado.nextLong();

        if (numero < 0 || numero >= 2_000_000_000) {
            System.out.println("El número ingresado está fuera del rango permitido.");
            return;
        }
        System.out.println("---------- FORMATO DE MONEDA -----------");
        System.out.println("Moneda: $ " + );
    }
    }