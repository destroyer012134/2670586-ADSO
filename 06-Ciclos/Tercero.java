import java.util.Scanner;

public class Tercero {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("=> Ingrese la altura de una piramide");
        int altura = teclado.nextInt();

        int i = 1;
        while (i <= altura) {
            int espacios = altura - i;
            while (espacios > 0) {
                System.out.print(" ");
                espacios--;
            }
            
            int caracteres = 2 * i - 1;
            while (caracteres > 0) {
                System.out.print("x");
                caracteres--;
            }
            
            System.out.println();
            i++;
        }
    }
    
}

