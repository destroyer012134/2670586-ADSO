import java.util.Scanner;

public class Cuarto {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        int numero3 = teclado.nextInt();
        
        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    
    }
}
