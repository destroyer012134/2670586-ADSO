import java.util.Scanner;

public class Primero {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        Scanner txto = new Scanner (System.in);

        System.out.println("Ingrese un numero entero que desea: ");
        int n = teclado.nextInt();

        String arreglo [] = new String[n];

        for(int i = 0; i < arreglo.length; i++    ){
            System.out.println("Ingrese alguna palabra");
            arreglo[i] = txto.nextLine();

        }


        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El Dato Ingresado Es: "+arreglo[i]);
        }
    }
}
