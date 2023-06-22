import java.util.Scanner;

public class Noveno {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su fecha de nacimiento. ");

        System.out.println("Dia: ");
        int dia = teclado.nextInt();

        System.out.println("Mes: ");
        int mes = teclado.nextInt();

        System.out.println("Año: ");
        int año = teclado.nextInt();

        if(año <= 2004){

            System.out.println("Usted es mayor de edad. ");

        }else{
            System.out.println("Usted es menor de edad. ");
        }

    }
}
