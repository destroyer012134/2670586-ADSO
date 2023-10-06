public class Ocho {
        public static void imprimirArreglo(int[] arreglo) {
            System.out.print("Contenido del arreglo: ");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]);
                if (i < arreglo.length - 1) {
                    System.out.print(", "); // Agrega una coma y espacio si no es el último elemento
                }
            }
        }
    
        public static void main(String[] args) {
            int[] miArreglo = {1, 2, 3, 4, 5};

            imprimirArreglo(miArreglo);
        }
    
}
