import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);
        
        Curso[] memoria = new Curso[100];
        int posicion = 0; //Variable para saber la posicion del curso en memoria 


        while(true){
            System.out.println("---------------------------------");
            System.out.println("                     " + "memoria: " + posicion + " cursos");
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
                memoria[posicion] = new Curso(codigo, nombre, Area_Conocimiento, Duracion, numTemas);
                    posicion++;
                    System.out.println("Curso creado con exito.");

            }
            if (respuesta ==2){
                
                for (int i = 0; i < posicion; i++) {
                    if (memoria[i] != null) {
                        memoria[i].ImprimirDetalle();
                    }
                }


            }

            if (respuesta == 3) {
                System.out.print("Ingrese el codigo del curso que desea ver: ");
                int codigoVer = teclado.nextInt();
                for (int i = 0; i < posicion; i++) {
                    if (memoria[i] != null && memoria[i].getCodigo() == codigoVer) {
                        memoria[i].ImprimirDetalle();

                        }
                        else if(memoria[i].getCodigo()!= codigoVer){
                            System.out.println("Codigo no encontrado o incorrecto");

                        }
                        
                    }
                }

                if (respuesta == 4) {
                    System.out.print("Ingrese el codigo del curso que desea editar: ");
                    int codigoEditar = teclado.nextInt();
                    for (int i = 0; i < posicion; i++) {
                        if (memoria[i] != null && memoria[i].getCodigo() == codigoEditar) {
                            System.out.print("Ingrese el nuevo nombre del curso: ");
                            String nuevoNombre = texto.nextLine();
                            System.out.print("Ingrese la nueva Area de Conocimiento: ");
                            String nuevaArea = texto.nextLine();
                            System.out.print("Ingrese la nueva duracion: ");
                            int nuevaDuracion = teclado.nextInt();
                            memoria[i].editarInfo(nuevoNombre, nuevaArea, nuevaDuracion);
                            System.out.println("Información del curso actualizada.");
                            
                        }
                        else if(memoria[i].getCodigo()!= codigoEditar){
                            System.out.println("Codigo no encontrado o incorrecto");

                        }

                    }
                }

                if (respuesta == 5) {
                    System.out.print("Ingrese el codigo del curso al que desea agregar un tema: ");
                    int codigoAgregarTema = teclado.nextInt();
                    for (int i = 0; i < posicion; i++) {
                        if (memoria[i] != null && memoria[i].getCodigo() == codigoAgregarTema) {
                            System.out.print("Ingrese el tema a agregar: ");
                            int tema = texto.nextInt();
                            memoria[i].agregarTema(tema);
                            System.out.println("Tema agregado con exito.");
                        }
                        else if(memoria[i].getCodigo()!= codigoAgregarTema){
                            System.out.println("Codigo no encontrado o incorrecto");

                        }
                    }
                }

                if (respuesta == 6) {
                    System.out.print("Ingrese el codigo del curso que desea eliminar: ");
                    int codigoEliminar = teclado.nextInt();
                    for (int i = 0; i < posicion; i++) {
                        if (memoria[i] != null && memoria[i].getCodigo() == codigoEliminar) {
                            memoria[i] = null;
                            System.out.println("Curso eliminado.");
                            posicion --;
                        }
                        else if(memoria[i].getCodigo()!= codigoEliminar){
                            System.out.println("Codigo no encontrado o incorrecto");

                        }
                    }
                }

                if (respuesta == 7){
                    System.out.println("Muchas gracias, Saliendo del programa...");
                    break;
                }
        }
    }
 }