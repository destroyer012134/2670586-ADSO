import java.util.Scanner;

public class Diez {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese una cadena de numero: ");
        int cadena = teclado.nextInt();

        if(cadena % 2 == 0){
            System.out.println("El numero es par. ");


        }else{
            System.out.println("El numero es impar. ");
        }
    }
}
