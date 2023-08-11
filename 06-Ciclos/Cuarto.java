import java.util.Scanner;

public class Cuarto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------BIENVENIDO--------");
        System.out.println("1. Docente");
        System.out.println("2. Estudiante");
        System.out.println("3. Salir");
        System.out.println("-------------------------");
        System.out.println("--> Ingrese una opcion: ");
        int opcion = teclado.nextInt();
        do{
        
            if(opcion == 1 ){
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

            if(opcion == 2 ){
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


            if(opcion == 3){
                System.out.println("HASTA LA PROXIMA HAS ELEGIDO LA OPCION 3");
            }

        }while(opcion == 0);
        


    }
}
