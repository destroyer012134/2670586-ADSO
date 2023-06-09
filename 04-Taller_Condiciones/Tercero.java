import java.util.Scanner;

public class Tercero {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        int x, y;

        System.out.print("Ingresar numero en X :");
        x = teclado.nextInt();

        System.out.println("Ingresar otro numero en Y :");
        y = teclado.nextInt();

        if (x > 0 && y > 0 ){ 
            System.out.println("Se encuentra en el 1mer cuadrante. ");

        }

        else if (x < 0 && y < 0){
            System.out.println("Se encuentra en el 3cer cuadrante. ");
        }

        if (x > 0 && y < 0){
            System.out.println("Se encuentra en el 4to cuandrante.");

        }
        
        else if (x < 0  && y > 0 ){
            System.out.println("Se encuentra en el 2gundo cuadrante. ");
        }

    }
}
