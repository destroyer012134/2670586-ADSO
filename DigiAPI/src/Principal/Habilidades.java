
package Principal;
import Utils.Digimon;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Habilidades extends javax.swing.JFrame {

      Digimon digimon;

    public Habilidades(Digimon digimon) {
        this.digimon = digimon; 
        initComponents();
        initAlternComponents();
        cargarDigimonData();
    }
    
    public void initAlternComponents(){
        setTitle(("DIGIMON"));
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public void cargarDigimonData() {
        cargarNombreDigimon();
        cargarImagenDigimon(digimon.getImagen());
        cargarLevels(digimon.getLevels());
        cargarTypes(digimon.getTypes());
        cargarAttributes(digimon.getAttributes());
        
    }

    public void cargarNombreDigimon() {
        etq_id.setText(digimon.getId());
        etq_nombre.setText(digimon.getNombre());
        
    }
    
    public void cargarImagenDigimon(String urlImagen) {
        try {
            URL imgUrl = new URL(urlImagen);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etq_imagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Digicard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarLevels(String[] levels) {
        panel_level.removeAll(); 
        for (String level : levels) {
            panel_level.add(new JLabel(level));
        }
        panel_level.revalidate();
        panel_level.repaint();
    }

    public void cargarTypes(String[] types) {
        panel_type.removeAll(); 
        for (String type : types) {
            panel_type.add(new JLabel(type));
        }
        panel_type.revalidate();
        panel_type.repaint();
    }

    public void cargarAttributes(String[] attributes) {
        panel_attribute.removeAll(); 
        for (String attribute : attributes) {
            panel_attribute.add(new JLabel(attribute));
        }
        panel_attribute.revalidate();
        panel_attribute.repaint();
    }



    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_attribute = new javax.swing.JLabel();
        etq_type = new javax.swing.JLabel();
        panel_attribute = new javax.swing.JPanel();
        panel_type = new javax.swing.JPanel();
        etq_fields = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_id = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        etq_level = new javax.swing.JLabel();
        panel_level = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_attribute.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_attribute.setText("Attribute");

        etq_type.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_type.setText("Type");

        javax.swing.GroupLayout panel_attributeLayout = new javax.swing.GroupLayout(panel_attribute);
        panel_attribute.setLayout(panel_attributeLayout);
        panel_attributeLayout.setHorizontalGroup(
            panel_attributeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        panel_attributeLayout.setVerticalGroup(
            panel_attributeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_typeLayout = new javax.swing.GroupLayout(panel_type);
        panel_type.setLayout(panel_typeLayout);
        panel_typeLayout.setHorizontalGroup(
            panel_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        panel_typeLayout.setVerticalGroup(
            panel_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        etq_fields.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_fields.setText("Fields");

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombre.setText("jLabel1");

        etq_id.setText("jLabel2");

        etq_imagen.setText("jLabel1");

        etq_level.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_level.setText("Level");

        javax.swing.GroupLayout panel_levelLayout = new javax.swing.GroupLayout(panel_level);
        panel_level.setLayout(panel_levelLayout);
        panel_levelLayout.setHorizontalGroup(
            panel_levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        panel_levelLayout.setVerticalGroup(
            panel_levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(etq_fields, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(etq_id))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panel_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(etq_level)
                            .addGap(61, 61, 61)
                            .addComponent(etq_attribute)
                            .addGap(61, 61, 61)
                            .addComponent(etq_type))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(panel_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panel_attribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_id)
                .addGap(331, 331, 331)
                .addComponent(panel_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(etq_fields)
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_level)
                        .addComponent(etq_attribute)
                        .addComponent(etq_type))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel_attribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_attribute;
    private javax.swing.JLabel etq_fields;
    private javax.swing.JLabel etq_id;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_level;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_type;
    private javax.swing.JPanel panel_attribute;
    private javax.swing.JPanel panel_level;
    private javax.swing.JPanel panel_type;
    // End of variables declaration//GEN-END:variables
}
