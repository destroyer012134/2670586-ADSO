import java.util.Scanner;

public class Primero {
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);

        int edad;

        System.out.println("Hola usuario, Porfavor digite su edad: ");
        edad = teclado.nextInt();

        if (edad >= 18){
            System.out.println("El usuario es mayor de edad. ");
        }

        else if (edad < 18){
            System.out.println("El usuario es menor de edad. ");
        }
    }
}
