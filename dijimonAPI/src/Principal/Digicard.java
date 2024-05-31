package Principal;
import Utils.Dijimon;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Principal.DijiDEX;


public class Digicard extends javax.swing.JPanel {
    Dijimon digimon;
    
      public Digicard (Dijimon digimon) {
        this.digimon = digimon;
        initComponents();
        cargarDigimonData();
    }

    public void cargarDigimonData() {
        etq_nombre.setText(digimon.getNombre());
        cargarImagenDigimon(digimon.getImagen());
    }

    public void cargarImagenDigimon(String urlImagen) {
        try {
            URL imgUrl = new URL(digimon.getImagen());
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etq_Digiimagen.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Digicard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_nombre = new javax.swing.JLabel();
        etq_Digiimagen = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(etq_Digiimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etq_Digiimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_Digiimagen;
    private javax.swing.JLabel etq_nombre;
    // End of variables declaration//GEN-END:variables
}
