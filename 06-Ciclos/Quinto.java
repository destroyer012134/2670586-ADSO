import java.util.Scanner;

public class Quinto {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();

        int a = 0, b = 1;
        System.out.print("La sucesion fibonacci es: ");


        while (a <= n) {
            System.out.print(a + ",");
            int temp = a;
            a = b;
            b = temp + b;
        }

    }
}
