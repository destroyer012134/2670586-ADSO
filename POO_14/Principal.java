import java.util.Scanner;
public class Principal {
    public static void main (String[]args){

        Scanner numero = new Scanner (System.in);
        Scanner texto = new Scanner (System.in);

         Perris listado [] = new Perris [20];

        //listado[0] = new Perris("criollo", "Miguel", 204, "Toby", 4.65, 100);
        //listado[1] = new Perris("Golden", "Bryan", 209, "hernesto", 4.23, 58);

        System.out.println("Ingrese nombre de mascota: ");
        String nombre = texto.nextLine();
        
        System.out.println("Ingrese nombre de propietario: ");
        String propietario = texto.nextLine();

        System.out.println("Ingrese edad de mascota: ");
        int edad = numero.nextInt();

        System.out.println("Ingrese peso de mascota");
        double peso = numero.nextDouble();

        System.out.println("Ingrese raza de mascota: ");
        String raza = texto.nextLine();

        System.out.println("Ingrese cantidad de energia de la mascota: ");
        int energia = numero.nextInt();


        listado [2] = new Perris(nombre, propietario, edad, raza, peso, energia);

        for(int i = 0; i < listado.length; i++){
            if(listado[i]!=null){
                listado[i].ImprimirDetalle();
            }

        }

         //perro mas pesado
        Perris mas_pesado = listado[0];

        for(int i=0; i<listado.length; i++){
            if(listado[i] != null){
                if (listado[i].getPeso()<=mas_pesado.getPeso()){
                    mas_pesado = listado[i];

                }
            }
    }
    if (mas_pesado != null) {
        System.out.println("Nombre mas pesado: " + mas_pesado.getNombre());
        System.out.println("propietario mas pesado: " + mas_pesado.getPropietario());
        System.out.println("peso de mas pesado: " + mas_pesado.getPeso());
    }
    }

   
}
