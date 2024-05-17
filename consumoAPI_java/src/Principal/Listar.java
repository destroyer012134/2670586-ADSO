package Principal;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;

public class Listar extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    ConsumoAPI consumo = new ConsumoAPI();

    
    public Listar() {
    initComponents();
    initAlternComponent();
}
    
    public void initAlternComponent(){
        
     String respuesta = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");

    JsonArray registros = JsonParser.parseString(respuesta).getAsJsonArray();
    
    DefaultTableModel modelo = (DefaultTableModel) tablaPersonas.getModel();
   for (int i = 0; i < registros.size(); i++) {
    JsonObject temp = registros.get(i).getAsJsonObject();
    
    String cedula = temp.has("cedula") ? temp.get("cedula").getAsString() : "";
    String nombre = temp.has("nombres") ? temp.get("nombres").getAsString() : "";
    String apellidos = temp.has("apellidos") ? temp.get("apellidos").getAsString() : "";
    String telefono = temp.has("telefono") ? temp.get("telefono").getAsString() : "";
    String direccion = temp.has("direccion") ? temp.get("direccion").getAsString() : "";
    String email = temp.has("email") ? temp.get("email").getAsString() : "";
    
    
    modelo.addRow(new Object[]{cedula, nombre, apellidos, telefono, direccion, email});


    }

 tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(100); 
tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(150); 
tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(150); 
tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(100); 
tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(200); 
tablaPersonas.getColumnModel().getColumn(5).setPreferredWidth(250); 

    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("LISTA DE PERSONAS");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", "Email"
            }
        ));
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
