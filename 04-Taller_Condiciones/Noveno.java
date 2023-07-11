import java.util.Scanner;

public class Noveno {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);

        System.out.println("=> Ingrese la nota de matematicas: ");
        int nota1 = teclado.nextInt();

        System.out.println("=> Ingrese la nota de español: ");
        int nota2 = teclado.nextInt();

        System.out.println("=> Ingrese la nota de ingles: ");
        int nota3 = teclado.nextInt();

        System.out.println("=> Ingrese la nota de ciencias naturales: ");
        int nota4 = teclado.nextInt();

        System.out.println("=> Ingrese la nota de deportes: ");
        int nota5 = teclado.nextInt();

        if(nota1 < nota2 && nota1 < nota3 && nota1 < nota4 && nota1 < nota5){
            System.out.println("=> Asignatura con menor nota es: Español "+nota1);

        }
        if(nota2 < nota1 && nota2 < nota3 && nota2 < nota4 && nota2 < nota5){
            System.out.println("=> Asignatura con menor nota es: Ingles "+nota2);

        }
        if(nota4 < nota2 && nota4 < nota3 && nota4 < nota1 && nota4 < nota5){
            System.out.println("=> Asignatura con menor nota es: Ciencias Naturales "+nota3);

        }
        if(nota3 < nota2 && nota3 < nota3 && nota3 < nota4 && nota3 < nota5){
            System.out.println("=> Asignatura con menor nota es: Deportes "+nota1);

        }
        



        if(nota1 < nota2 && nota1 < nota3 && nota1 < nota4 && nota1 < nota5){
            System.out.println("=> Asignatura con mayor nota es: Español "+nota1);

        }
        if(nota2 < nota1 && nota2 < nota3 && nota2 < nota4 && nota2 < nota5){
            System.out.println("=> Asignatura con mayor nota es: Ingles "+nota2);

        }
        if(nota4 < nota2 && nota4 < nota3 && nota4 < nota1 && nota4 < nota5){
            System.out.println("=> Asignatura con mayor nota es: Ciencias Naturales "+nota3);

        }
        if(nota3 < nota2 && nota3 < nota3 && nota3 < nota4 && nota3 < nota5){
            System.out.println("=> Asignatura con mayor nota es: Deportes "+nota1);

        }
        

        
    }
}
