import java.util.Scanner;

public class Diecinueve {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        Double peso, altura;


        System.out.println("Ingrese su peso: ");
        peso = teclado.nextDouble();

        System.out.println("Ingrese su altura: ");
        altura = teclado.nextDouble();

        Double IMC = peso / (altura*2);

        System.out.print("Este es el Indice de Masa Corporal: "+IMC);


    }
}
