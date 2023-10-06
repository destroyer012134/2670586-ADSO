public class Maximo {

    public static int encontrarMaximo(int num1, int num2, int num3) {
        int maximo = num1;

        if (num2 > maximo) {
            maximo = num2;
        }

        if (num3 > maximo) {
            maximo = num3;
        }

        return maximo;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int numero3 = 8;

        int maximo = encontrarMaximo(numero1, numero2, numero3);

        System.out.println("El valor maximo entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + maximo);
    }
}
