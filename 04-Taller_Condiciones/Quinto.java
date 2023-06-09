import java.util.Scanner;

public class Quinto {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingresar primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingresar segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Ingresar tercer número: ");
        int numero3 = teclado.nextInt();

        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println("Los números se ingresaron en orden ascendente.");
        } else {
            System.out.println("Los números NO se ingresaron en orden ascendente.");
        }
    
    }
}
