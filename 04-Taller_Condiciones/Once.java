import java.util.Scanner;

public class Once {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese precio normal: ");
        Double precio = teclado.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        int descuento = teclado.nextInt();

        

        if(descuento >= 0 && descuento <= 100){

            Double total = precio * descuento / 100.0;

            System.out.println("El descuento es: "+total);






        }else{
            System.out.println("Porcentaje de descuento incorrecto. ");
        }
    }
}
