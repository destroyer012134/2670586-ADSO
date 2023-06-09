import java.util.Scanner;

public class Nueve {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }


    }
}
