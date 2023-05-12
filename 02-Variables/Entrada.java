import java.util.Scanner;


public class Entrada {
    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);

        byte turno;
        short loteria_risaralda;
        int saldo_bancario;
        long tarjeta_identidad;
        float nota;
        double pi;
        boolean bandera;

        System.out.println("Ingrese turno: ");
        turno = teclado.nextByte();

        System.out.println("Ingrese loteria_risaralda: ");
        loteria_risaralda = teclado.nextShort();

        System.out.println("Ingrese saldo_bancario: ");
        saldo_bancario = teclado.nextInt();

        System.out.println("Ingrese tarjeta_identidad: ");
        tarjeta_identidad = teclado.nextLong();

        System.out.println("Ingrese nota: ");
        nota = teclado.nextFloat();

        System.out.println("Ingrese PI: ");
        pi = teclado.nextDouble();

        System.out.println("Ingrese bandera: ");
        bandera = teclado.nextBoolean();

        

        System.out.println("Turno: "+turno);
        

        System.out.println("Loteria: "+loteria_risaralda);
  

        System.out.println("Saldo: "+saldo_bancario);
    

        System.out.println("Tarjeta Identidad: "+tarjeta_identidad);
     

        System.out.println("Nota: "+nota);
        

        System.out.println("PI: "+pi);
    

        System.out.println("Bandera: "+bandera);


    }
}
