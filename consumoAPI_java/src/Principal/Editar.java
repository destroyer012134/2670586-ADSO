package Principal;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import utils.ConsumoAPI;



public class Editar extends javax.swing.JPanel {
    
   ConsumoAPI consumo = new ConsumoAPI();
    
    public Editar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        etqApellidos = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        etqCorreo1 = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL EDITAR");

        contenedorFormulario.setBackground(new java.awt.Color(255, 255, 255));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqDocumento.setText("Documento:");

        campoDocumento.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqNombres.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqNombres.setText("Nombres:");

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqApellidos.setText("Apellidos:");

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqTelefono.setText("Telefono:");

        etqCorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo.setText("Correo Elec.:");

        campoNombres.setMargin(new java.awt.Insets(2, 10, 2, 10));

        campoApellidos.setMargin(new java.awt.Insets(2, 10, 2, 10));

        campoTelefono.setMargin(new java.awt.Insets(2, 10, 2, 10));

        campoCorreo.setMargin(new java.awt.Insets(2, 10, 2, 10));

        etqCorreo1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo1.setText("Direccion:");

        campoDireccion.setMargin(new java.awt.Insets(2, 10, 2, 10));

        btnEditar.setBackground(new java.awt.Color(0, 153, 0));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addGap(27, 27, 27)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        String direccion = campoDireccion.getText();
        
        
        
        //endpoint actualizar
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", documento);
        datosActualizar.put("nombres", nombres);
        datosActualizar.put("apellidos", apellidos);
        datosActualizar.put("telefono", telefono);
        datosActualizar.put("direccion", direccion);
        datosActualizar.put("email", correo);
        String respuesta = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("Respuesta al Actualizar"+respuesta);
        
        campoDocumento.setText("");
        campoNombres.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoCorreo.setText("");
        campoDireccion.setText("");

    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqCorreo1;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
