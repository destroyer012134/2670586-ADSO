import java.util.Scanner;

public class Cuarto {
    /**
     * @param args
     */
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese longitud de numeros deseada: ");
        int longitud = teclado.nextInt();

        int arreglo [] = new int[longitud];

        

        for(int i = 0; i < arreglo.length; i++    ){
            System.out.println("Ingrese dato "+i+" : ");
            arreglo[i] = teclado.nextInt();
            

        }

        for(int i = 0; i <arreglo.length; i++){
            System.out.println("Arreglo original: "+arreglo[i] + " ");

        }

        // Ordenar el arreglo en orden descendente usando el algoritmo de burbuja
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo Descendiente:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }



        

        
    }
}