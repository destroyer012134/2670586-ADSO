public class Principal{

    public static void main(String[] args) {
       
        
        Perris perro_01 = new Perris("Boxer", "Maria", 108, "Pecas", 30.5, 40);
        Perris perro_02 = new Perris("Susuki", "Miguel", 203, "Princesa", 50.5, 60);
        
        perro_01.comer(800);

        perro_01.setNombre("Toby");
        perro_01.setPropietario("Miguel Mora");
        
        perro_01.ImprimirDetalle();
        perro_02.ImprimirDetalle();
        


       

















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