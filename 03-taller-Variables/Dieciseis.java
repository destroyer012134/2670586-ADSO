import java.util.Scanner;

public class Dieciseis {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el monto inicial: ");
        double principal = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteres = teclado.nextDouble() / 100; // Convertir a decimal

        System.out.print("Ingrese el número de períodos: ");
        int numPeriodos = teclado.nextInt();

        System.out.print("Ingrese el número de veces que se compone el interés por año: ");
        int numComposiciones = teclado.nextInt();

        double montoFinal = calcularMontoFinal(principal, tasaInteres, numPeriodos, numComposiciones);

        System.out.println("El monto final es: " + montoFinal);
    }

    public static double calcularMontoFinal(double principal, double tasaInteres, int numPeriodos, int numComposiciones) {
        double montoFinal = principal * Math.pow(1 + (tasaInteres / numComposiciones), numPeriodos * numComposiciones);
        return montoFinal;

    }
}
