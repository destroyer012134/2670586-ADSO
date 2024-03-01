package principal;

import utils.BaseDatos;
import utils.Persona;

public class PanelEliminar extends javax.swing.JPanel {
    
    BaseDatos basedatos;
    Persona persona;
    
    public PanelEliminar(BaseDatos basedatos) {
        this.basedatos = basedatos;
        initComponents();
        initAlterncomponents();
    }
    
    public void initAlterncomponents(){
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("PANEL ELIMINAR");

        etqDocumento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqDocumento.setText("DOCUMENTO");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqNombres.setText("NOMBRES");

        etqApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqApellidos.setText("APELLIDOS");

        etqTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTelefono.setText("TELEFONO");

        etqCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqCorreo.setText("CORREO ELECTRONICO");

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(etqDocumento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(etqNombres))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(etqApellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(etqTelefono))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(etqCorreo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombres)
                .addGap(12, 12, 12)
                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

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
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        
        //VERIFICAR
          boolean verificar = false; 
          if(documento.equals(" ") | nombres.equals(" ") | apellidos.equals(" ") | telefono.equals(" ") | correo.equals(" ") ){
              System.out.println("NO SE HA PODIDO VERIFICAR");
              verificar = false;
          }else{
              verificar = true; 
               boolean personaEliminada = basedatos.eliminarPersona(documento);
              System.out.println("Se HA PODIDO ELIMINAR ESTA PERSONA.");
              
          }
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
