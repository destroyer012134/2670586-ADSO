import java.util.Scanner;

public class Catorce {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la nota de la primera materia:");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Ingrese el número de créditos de la primera materia:");
        int creditos1 = teclado.nextInt();
        
        System.out.println("Ingrese la nota de la segunda materia:");
        double nota2 = teclado.nextDouble();
        
        System.out.println("Ingrese el número de créditos de la segunda materia:");
        int creditos2 = teclado.nextInt();
        
        System.out.println("Ingrese la nota de la tercera materia:");
        double nota3 = teclado.nextDouble();
        
        System.out.println("Ingrese el número de créditos de la tercera materia:");
        int creditos3 = teclado.nextInt();
        
        // Cálculo del promedio ponderado
        double sumaNotas = (nota1 * creditos1) + (nota2 * creditos2) + (nota3 * creditos3);
        int sumaCreditos = creditos1 + creditos2 + creditos3;
        double promedioPonderado = sumaNotas / sumaCreditos;
        
        System.out.println("El promedio ponderado es: " + promedioPonderado);

    }
}
