import java.util.Scanner;

public class Sexto {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18 ){
            System.out.print("El usuario es mayor de edad. ");

        }else {
            System.out.println("El usuario es menor de edad. ");

        }
    }
}
