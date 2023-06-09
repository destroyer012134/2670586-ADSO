import java.util.Scanner;

public class Trece {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingresa el número de segundos: ");
        int segundosInput = teclado.nextInt();

        int horas = segundosInput / 3600;
        int minutos = (segundosInput % 3600) / 60;
        int segundos = (segundosInput % 3600) % 60;

        System.out.println("El resultado es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
}
