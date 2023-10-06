import java.util.Random;

public class Arreglo {

    public static void llenarArregloAleatorio(int[] arreglo, int minimo, int maximo) {
        Random rand = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
    }

    public static void main(String[] args) {
        int[] miArreglo = new int[10];
        int valorMinimo = 1;
        int valorMaximo = 100;

        llenarArregloAleatorio(miArreglo, valorMinimo, valorMaximo);

        // Imprime el arreglo lleno de números aleatorios
        System.out.print("Arreglo lleno de números aleatorios: ");
        for (int num : miArreglo) {
            System.out.print(num + " ");
        }
    }
}


