import java.util.Scanner;

public class Siete {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        int porcentaje;
        Double n1;

        System.out.println("Ingrese el precio al que desea ver el total de descuento: ");
        n1 = teclado.nextDouble();

        System.out.println("Ingrese el procentaje de descuento: ");
        porcentaje = teclado.nextInt();

        Double resultado = (n1/100)*porcentaje;

        System.out.println("El descuento seria de: "+resultado);

    }
}
