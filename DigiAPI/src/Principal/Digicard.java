package Principal;
import Utils.Digimon;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Principal.DigiDEX;


public class Digicard extends javax.swing.JPanel {
    Digimon digimon;
    
      public Digicard (Digimon digimon) {
        this.digimon = digimon;
        initComponents();
        cargarDigimonData();
    }

    public void cargarDigimonData() {
        cargarNombreDigimon();
        cargarImagenDigimon(digimon.getImagen());
    }

    public void cargarNombreDigimon() {
        etq_nombre.setText(digimon.getNombre());
    }
    
    public void cargarImagenDigimon(String urlImagen) {
        try {
            URL imgUrl = new URL(urlImagen);
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

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(etq_Digiimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_Digiimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_Digiimagen;
    private javax.swing.JLabel etq_nombre;
    // End of variables declaration//GEN-END:variables
}
