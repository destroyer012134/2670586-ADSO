import java.util.Scanner;

public class Segundo {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("=> Ingresar cantidad de Materias");
        int cantidad = teclado.nextInt();

        double sumarNotas = 0, sumarCreditos = 0;
        int contador = 1;

        while(contador <= cantidad){
            System.out.println("=> ingrese Nota Materia "+contador+" : ");
            Float nota = teclado.nextFloat();

            System.out.println("=> Ingrese Credios Materia "+contador+" : ");
            int creditos = teclado.nextInt();

            sumarNotas = sumarNotas + (nota*creditos);
            sumarCreditos = sumarCreditos + creditos;
            
            contador = contador + 1;

        }
        
            double prom = sumarNotas / cantidad / sumarCreditos;

        System.out.println("Total creditos: "+sumarCreditos);
        System.out.println("El promedio del semestre es: "+prom);


    }
}
