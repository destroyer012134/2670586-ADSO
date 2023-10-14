import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);
        
        Curso[] memoria = new Curso[100];


        while(true){
            System.out.println("---------------------------------");
            System.out.println("                     " + "memoria: " + memoria + " cursos");
            System.out.println("1. Crear Cruso");
            System.out.println("2. Listar todos los cursos");
            System.out.println("3. Ver Detalle del Curso");
            System.out.println("4. Editar informacion de un Curso");
            System.out.println("5. Agregar tema a un curso");
            System.out.println("6. Eliminar Curso");
            System.out.println("7. Salir");
            System.out.println("---------------------------------");
            int respuesta = teclado.nextInt();
            if(respuesta == 1){
                System.out.println("---------------------------------");
                System.out.println("Ingresar informacion del curso");
                System.out.println("---------------------------------");
                System.out.println("Ingrese el codigo: ");
                int codigo = teclado.nextInt();
                System.out.print("Ingrese el nombre: ");
                String nombre = texto.nextLine();
                System.out.println("Ingrese Area de Conocimiento: ");
                String Area_Conocimiento = texto.nextLine();
                System.out.println("Ingrese la Duracion: ");
                int Duracion = teclado.nextInt();
                System.out.println("Ingrese numero de temas");
                int numTemas = teclado.nextInt();
                if (numTemas > 15){
                    System.out.println("Maximo de temas alcanzado, favor ingresar menos temas.");
                    numTemas = teclado.nextInt();
                }
                memoria [0] = new Curso(codigo, nombre, Area_Conocimiento, Duracion, numTemas);

                         
                

            }
        }
    }
}