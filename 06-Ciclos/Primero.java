import java.util.Scanner;

public class Primero {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);


        

        System.out.println("Ingresar cantidad de notas: ");
        int cantidad = teclado.nextInt();

        double sumarNotas = 0;
        int contador = 1;

        while(contador <= cantidad){
            System.out.println("=> Ingrese nota"+contador+": ");
            double nota = teclado.nextDouble();

            sumarNotas = sumarNotas + nota;

            contador = contador + 1;
        }

        double promedio = sumarNotas / cantidad;
        System.out.println("=> El promedio del estudiante es: "+promedio);

    }
}
