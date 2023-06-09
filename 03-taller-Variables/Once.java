import java.util.Scanner;

public class Once {
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);

        Double radio;

        System.out.println("INGRESE EL RADIO DEL CIRCULO: ");
        radio = teclado.nextDouble();

        Double perimetro =  (2 * 3.14 * radio);
        Double area =  (2 * 3.14 * radio);

        System.out.println("El perimetro del ciruclo es: "+perimetro);

        System.out.println("El area del circulo es: "+area);

    }

   
}
