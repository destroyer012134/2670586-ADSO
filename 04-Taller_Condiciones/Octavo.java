import java.util.Scanner;

public class Octavo {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingresar horas trabajdas: ");
        Double horas = teclado.nextDouble();

        System.out.println("Ingresar tarifa por horas: ");
        Double tarifa = teclado.nextDouble();

        Double extra = tarifa * horas * 1.5;

        Double pago = tarifa * horas;

        if(horas <= 40 ){
            System.out.println("El total de salario seria: "+pago);

        }else if(horas > 40){
            System.out.println("El total del salario semanal con horas extra seria de: "+extra);

        }

    }
}
