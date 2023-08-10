import java.util.Scanner;

public class Tercero {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanoArreglo = teclado.nextInt();

        
        int[] arreglo = new int[tamanoArreglo];
        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }

        
        System.out.print("Ingrese una posición para imprimir en sentido anti horario: ");
        int posicion = teclado.nextInt();

        
        System.out.print("Arreglo: ");
        imprimirArreglo(arreglo);

        System.out.print("Posición: " + posicion + "\nAnti horario: ");
        imprimirAntiHorario(arreglo, posicion);

        scanner.close();
    }

    // Función para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Función para imprimir en sentido anti horario desde una posición dada
    public static void imprimirAntiHorario(int[] arreglo, int posicion) {
        for (int i = posicion; i < arreglo.length + posicion; i++) {
            int index = i % arreglo.length;
            System.out.print(arreglo[index]);
            if (i < posicion + arreglo.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
}


    
