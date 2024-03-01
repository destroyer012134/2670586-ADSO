package principal;

import utils.BaseDatos;
import utils.Persona;


public class PanelEditar extends javax.swing.JPanel {
    
    BaseDatos basedatos;
    Persona persona; 
    
    public PanelEditar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
    }
    
    public void initAlternComponents(){
        
        setVisible(true);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 204));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL EDITAR");

        etqDocumento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(204, 0, 0));
        etqDocumento.setText("DOCUMENTO");

        campoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDocumentoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(153, 0, 0));
        etqNombres.setText("NOMBRES");

        etqApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(153, 0, 0));
        etqApellidos.setText("APELLIDOS");

        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(153, 0, 0));
        etqTelefono.setText("TELEFONO");

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        etqCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(153, 0, 0));
        etqCorreo.setText("CORREO ELECTRONICO");

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        etqDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(153, 0, 0));
        etqDireccion.setText("DIRECCION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(etqNombres))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(etqApellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(etqTelefono))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(etqDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDireccion)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(campoTelefono)
                            .addComponent(campoApellidos)
                            .addComponent(campoNombres)
                            .addComponent(campoDocumento))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(etqCorreo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(etqDocumento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addComponent(etqNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqApellidos)
                .addGap(12, 12, 12)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDocumentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        if(campoDocumento.getText() != null){
            String documentoEditar = campoDocumento.getText();
            persona = basedatos.buscarPersona(documentoEditar);
            System.out.println("SE HA ENCONTRADO EL DOCUMENTO");
            
            campoNombres.setText(persona.getNombres());
            campoApellidos.setText(persona.getApellidos());
            campoTelefono.setText(persona.getTelefono());
            campoCorreo.setText(persona.getCorreo());
            
            
        }else{
            System.out.println("NO SE HA ENCONTRADO DOCUMENTO");
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();
        String correo = campoCorreo.getText();

            //VALIDACION
            boolean verificar = false; 
         if(documento.equals("") || nombres.equals("") || apellidos.equals("") | telefono.equals("") || correo.equals("")) {
                System.out.println("NO SE PUDO VALIDAR.");
                verificar = false;
           } else {
            verificar = true;
               System.out.println("Si se pudo verificar");
               boolean editarpersona = basedatos.actualizarPersona(documento, nombres, apellidos, direccion, telefono, correo);
}

        

    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
