import java.util.Scanner;

public class Sexto {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar la posición del n-simo fibonaxi: ");
        int n = teclado.nextInt();


        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }


        System.out.println("El n-simo fibonachi es: " + a);
    }
}
