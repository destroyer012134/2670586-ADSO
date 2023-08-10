import java.util.Scanner;

public class Segundo {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.println("Ingrese un numero entero. ");
        int n = teclado.nextInt();

        String arreglo [] = new String[n];

        for(int i = 0; i < arreglo.length; i++    ){
            System.out.println("Ingrese un dato de tipo texto");
            arreglo[i] = texto.nextLine();

        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Los datos ingresados son: "+arreglo[i]);
        }

        System.out.println("Ingrese un dato exacto ingresado anteriormente: ");
        String nombre = texto.nextLine();

       for(int i = 0; i < n; i++ ){
        if (arreglo[i].equalsIgnoreCase(nombre)) {
            System.out.println("El nombre '" + nombre + "' se encuentra en la posición: " + i);
            

       }
    }

    

}

}

