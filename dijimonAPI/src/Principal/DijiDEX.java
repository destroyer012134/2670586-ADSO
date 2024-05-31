package Principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import Utils.ConsumoAPI;
import Utils.Dijimon;
import java.awt.FlowLayout;
import javax.swing.Icon;

    

public class DijiDEX extends javax.swing.JFrame {

       ConsumoAPI consumo;
       int pagina;
       Dijimon listadijimon[];
               
               
    public DijiDEX() {
        this.consumo = new ConsumoAPI();
        
        initComponents();
        initAlternComponents();
        cargarDigimones();
    }
    
    public void initAlternComponents(){
        setTitle("DIGIMON");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("img/digilogo.png")) );
        Image icono_listar = getToolkit().createImage(ClassLoader.getSystemResource("img/logo_1.png"));
        icono_listar = icono_listar.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        etq_img.setIcon(new ImageIcon(icono_listar));
        setLocationRelativeTo(null);
        setVisible(true); 
        
    }
    
     public void cargarDigimones(){
        String endpoint = "https://digi-api.com/api/v1/digimon";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("content");
        
        listadijimon = new Dijimon[results.size()];
        for (int i=0; i<results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
         
            String id = temp.get("id").getAsString();
            String nombre = temp.get("name").getAsString();
            String url = temp.get("href").getAsString();
            String imagen = temp.get("image").getAsString();
            
            listadijimon[i] = new Dijimon(id, nombre, url, imagen);


            Digicard tarjeta = new Digicard(listadijimon[i]);
            Panel_Digimones.add(tarjeta);
            
            
            repaint();
            revalidate();
        }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_img = new javax.swing.JLabel();
        Panel_Digimones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etq_img.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Panel_Digimones.setLayout(new java.awt.GridLayout(2, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_Digimones, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Digimones;
    private javax.swing.JLabel etq_img;
    // End of variables declaration//GEN-END:variables
}
