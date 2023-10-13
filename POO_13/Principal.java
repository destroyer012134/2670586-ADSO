public class Principal{

    public static void main(String[] args) {
       
        
        Perris perro_01 = new Perris("Boxer", "Maria", 108, "Pecas", 30.5, 40);
        Perris perro_02 = new Perris("Susuki", "Miguel", 203, "Princesa", 50.5, 60);
        Perris perro_03 = new Perris("Golden", "Felipe", 204, "Lola", 60.6, 48);
                
        perro_01.ImprimirDetalle();
        perro_02.ImprimirDetalle();
        perro_03.ImprimirDetalle();

        perro_01.comer(1000);
        perro_01.jugar(10);
        perro_02.dormir(4);
        perro_03.caminar(60);

        perro_01.ImprimirDetalle();
        perro_02.ImprimirDetalle();
        perro_03.ImprimirDetalle();
    

        


       

















            //Clases: Definen nuevos tipos de datos
            // una clase puede verse como una plantilla
            //que se usa ara crear objetos/variables
            //Archivos con extension .java

            




            //atributos: datos propios de la calse definidao o caracteristica;
                        // los atributos son variables globales
            //metodos: Acciones que puede realizar un objeto que pertenece a una clase 
                    // Se representan como funciones. 


    }
}