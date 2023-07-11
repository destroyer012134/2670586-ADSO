import java.util.Scanner;

public class Sexto{
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        // Pedir al usuario que ingrese un número de 6 dígitos
        System.out.print("Ingrese un número de 6 dígitos: ");
        int numero = teclado.nextInt();

        // Mostrar el menú
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Menú:");
        System.out.println("1. Primer Digito. 2. Segundo Digito. 3. Tercer Digito.");
        System.out.println("4. Cuarto Digito. 5. Quinto Digito. 6. Sexto Digito.");
        System.out.println("-------------------------------------------------------------------");

        // Pedir al usuario que ingrese una opción del menú
        System.out.print("Ingrese una opción: ");
        int opcion = teclado.nextInt();

        // Obtener el dígito correspondiente a la opción elegida
        int digito;
        if (opcion == 6) {
            // Si la opción es 6, obtenemos el último dígito usando el operador %
            digito = numero % 10;
        } else {
            // Para las opciones 1-5, eliminamos los dígitos después del deseado usando la operación / y %
            int divisor = (int) Math.pow(10, opcion);
            int cociente = numero / divisor;
            digito = cociente % 10;
        }

        // Mostrar el dígito obtenido
        System.out.println("El dígito seleccionado es: " + digito);
    }
}

    