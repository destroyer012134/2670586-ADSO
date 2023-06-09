import java.util.Scanner;

public class Doce {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        Double ancho, altura;

        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = teclado.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        altura = teclado.nextDouble();

        Double area = ancho*altura;

        System.out.print("El area del rectangulo es: "+area);


    }
}
