import java.util.Scanner;

public class Seis {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        int n1, n2;

        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        n2 = teclado.nextInt();

        int prom = n1 + n2 / 2;

        System.out.println("Este es el promedio de los numeros ingresados anteriormente: "+prom);

    }
}
