import java.util.Scanner;

public class Ejercicio_01 {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);

       
        
        //Se le pide al usuario ingresar un numero de maximo 6 Digitos
        System.out.println("Ingrese un numeros de maximo 6 digitos: ");
        int n = teclado.nextInt();

         //Se crean las variables necesarias para generar el bucle de inversion
        int invertido = 0;
        int resto;
        int original = n;
        

        //Bucle de inversion: 
        while(n > 0  ){
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n /= 10;

        }

            

        //Imprimir si el numero es u NO palindromo.
        if(original == invertido){
            System.out.println("El numero "+original+" es palindromo");
            }else{
            System.out.println("El numero  "+original+" NO es palindromo");
            }


        
        





    }
}
