import java.util.Scanner;

public class Septimo {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la base del triangulo: ");
        double base = teclado.nextDouble();

        System.out.println("Ingrese la altura de un triangulo: ");
        double altura = teclado.nextDouble();

        double area = (base * altura);

        if(base > 0 ){
            System.out.println("El area del triangulo es: "+area);

        }

        if(altura > 0 ){
            System.out.println("El area del triangulo es: "+area);

        }else{
            System.out.println("Error, el numero debe ser positivo. ");
        }
    }
}
