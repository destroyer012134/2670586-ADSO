import java.util.Scanner;

public class Diez {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        int n1, n2; 

        System.out.println("Escribir primer numero que desee dividir: ");
        n1 = teclado.nextInt();

        System.out.print("Escribe el segundo numero que desee dividir por el primero: ");
        n2 = teclado.nextInt();

        int divisor = n1 / n2;
        int resto = n1 % n2;

        System.out.println("El resultado de la division es: "+divisor);
        

        System.out.println("El resto de la division es: "+resto);
      
    }
}
