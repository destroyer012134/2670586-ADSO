
package Principal;

public class Principal {
    public static void main(String args[]) {
        
        
         //Instancia para realizar consumo
       //ConsumoAPI consumo = new ConsumoAPI();
       
       Pokemen menu = new Pokemen();
       
        
        //endpoint obtener
        //String respuesta01 = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon?offset=20&limit=20");
        //System.out.println(respuesta01);

        //Endopoint Insetar
       // Map<String, String> datosInsertar = new HashMap<>();
        //datosInsertar.put("cedula", "33332");
       // datosInsertar.put("nombres", "Lana");
       // datosInsertar.put("apellidos", "Rhoades");
       // datosInsertar.put("telefono", "3233341938");
       //datosInsertar.put("direccion", "SENA");
       // datosInsertar.put("email", "lanaroades@gmail.com");
       // String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
       // System.out.println("Respuesta al insertar"+respuesta02);
        
        
        //endpoint actualizar
        //Map<String, String> datosActualizar = new HashMap<>();
        //datosActualizar.put("cedula", "102131");
        //datosActualizar.put("nombres", "Alejandro");
        //datosActualizar.put("apellidos", "Hernandez Romero");
        //datosActualizar.put("telefono", "350499");
        //datosActualizar.put("direccion", "SENA");
        //datosActualizar.put("email", "alejo@gmail.com");
        //String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        //System.out.println("Respuesta al Actualizar"+respuesta03);
          
          
          //endpoint Eliminar
        //Map<String, String> datosEliminar = new HashMap<>();
        //datosEliminar.put("cedula", "102131");
       // String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
       // System.out.println("Respuesta al Eliminar"+respuesta03);
       
      //  JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        
        //for(int i = 0; i<registros.size(); i++){
           // JsonObject temp = registros.get(i).getAsJsonObject();
           // String nombres = temp.get("nombres").getAsString();
           // String apellidos = temp.get("apellidos").getAsString();
            
           // System.out.println("Nombres: "+nombres+" "+"Apellidos: "+apellidos);
       // }
        
    }
}
