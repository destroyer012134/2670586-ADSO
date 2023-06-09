import java.util.Scanner;

public class Segundo {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

         System.out.print("Ingrese el primer número: ");
    int num1 = teclado.nextInt();

    System.out.print("Ingrese el segundo número: ");
    int num2 = teclado.nextInt();

    System.out.print("Ingrese el tercer número: ");
    int num3 = teclado.nextInt();

    System.out.print("Ingrese el cuarto número: ");
    int num4 = teclado.nextInt();

    int max = num1;

    if (num2 > max) {
      max = num2;
    }

    if (num3 > max) {
      max = num3;
    }

    if (num4 > max) {
      max = num4;
    }

    System.out.println("El número máximo es " + max);
  }
    
}
