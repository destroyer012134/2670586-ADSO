import java.util.Scanner;

public class Quince {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        Double metros, centimetros, pulgadas, pies;

        System.out.print("Ingrese su medida en metros: ");
        metros = teclado.nextDouble();

        centimetros = (metros*100);
        pulgadas = (metros*39.37);
        pies = (metros*3.28084);

        System.out.println("Medida en centimetros: "+centimetros);

        System.out.println("Medida en pulgadas: "+pulgadas);

        System.out.println("Medidas en pies: "+pies);



    }
}
