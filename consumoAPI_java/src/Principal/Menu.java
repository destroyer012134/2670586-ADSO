package Principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    
    
    public Menu() {
        initComponents();
        
        btnListarActionPerformed(null);
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Menu");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Image icono_registro = getToolkit().createImage(ClassLoader.getSystemResource("img/api.png"));
        icono_registro = icono_registro.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(icono_registro));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("img/api.png")));
        
        
        repaint();
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqImagen = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();
        etqTemporal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentMenu.setBackground(new java.awt.Color(255, 255, 255));

        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnListar.setBackground(new java.awt.Color(204, 204, 204));
        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListar.setText("  LISTAR");
        btnListar.setFocusable(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(204, 204, 204));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrear.setText("   CREAR");
        btnCrear.setFocusable(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setText("  EDITAR");
        btnEditar.setFocusable(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("   ELIMINAR");
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etqImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        contentPrincipal.setBackground(new java.awt.Color(102, 102, 255));

        etqTemporal.setBackground(new java.awt.Color(255, 255, 255));
        etqTemporal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqTemporal.setForeground(new java.awt.Color(255, 255, 255));
        etqTemporal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTemporal, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTemporal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        // Crear el contenedor nuevo
        Listar nuevo = new Listar();
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
         // Crear el contenedor nuevo
        Insertar nuevo = new Insertar();
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Crear el contenedor nuevo
        Editar nuevo = new Editar();
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
         // Crear el contenedor nuevo
        Eliminar nuevo = new Eliminar();
        
        // Ajustar el tamaño del contenedor nuevo
        nuevo.setPreferredSize( contentPrincipal.getPreferredSize() );
        nuevo.setSize( contentPrincipal.getSize() );
        
        // Eliminar el contenido del contentPrincipal
        contentPrincipal.removeAll();
        
        // Agregar dentro de contentPrincipal el contenedor nuevo.
        contentPrincipal.add(nuevo);
        
        // repaint();
        repaint();
        revalidate();
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqTemporal;
    // End of variables declaration//GEN-END:variables
}
