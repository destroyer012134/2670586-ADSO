import java.util.Scanner;

public class Dieciocho {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese la cantidad en pesos colombianos (COP): ");
        double cantidadCOP = teclado.nextDouble();

        double conversionUSD = convertirMoneda(cantidadCOP, 0.00028); 
        double conversionEUR = convertirMoneda(cantidadCOP, 0.00024); 
        double conversionJPY = convertirMoneda(cantidadCOP, 0.030); 
        double conversionGBP = convertirMoneda(cantidadCOP, 0.00020); 
        System.out.println("USD: " + conversionUSD);
        System.out.println("EUR: " + conversionEUR);
        System.out.println("JPY: " + conversionJPY);
        System.out.println("GBP: " + conversionGBP);
    }

    public static double convertirMoneda(double cantidad, double tasaCambio) {
        return cantidad * tasaCambio;
    }
}
