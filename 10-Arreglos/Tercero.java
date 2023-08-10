import java.util.Scanner;

public class Tercero {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in); 
        int opcion;
        int registros = 0;
         String clientes [] = new String[100];

        int memoria = 100;

        do{
            System.out.println("-------------Memoria Dispible: "+memoria+"Registros");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Ver lista de clientes.");
            System.out.println("3. Editar Cliente");
            System.out.println(("5. Salir."));


        
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();

            
                 if(memoria == 0){
                System.out.println("Ya no hay mas memoria, no se pueden registrar mas clientes");
            }

                boolean cliente_existe = false;
                for (int i = 0; i < )


                    
                }

            if (opcion == 2){   
                    System.out.println("Esta es la lista de clientes "+clientes[i]);

                
            }

           

                
        }
                    

                }

            
        }while (opcion != 5);



        
    }
}
