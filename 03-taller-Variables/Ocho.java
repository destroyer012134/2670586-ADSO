import java.util.Scanner;

public class Ocho {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        String p1, p2;

        System.out.println("Ingresar primer cadena de texto: ");
        p1 = teclado.nextLine();

        System.out.println("Ingresar segunda cadena de texto: ");
        p2 = teclado.nextLine();

        String resultado = p1 + p2;

        System.out.println("Resultado: "+resultado);
    }
}
