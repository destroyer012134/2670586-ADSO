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
import Utils.Digimon;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Icon;
import Principal.Habilidades;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

    

public class DigiDEX extends javax.swing.JFrame {

       ConsumoAPI consumo;
       int pagina;
       Digimon listadijimon[];
               
               
    public DigiDEX() {
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
        
        listadijimon = new Digimon[results.size()];
        for (int i=0; i<results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
         
            String id = temp.get("id").getAsString();
            String nombre = temp.get("name").getAsString();
            String url = temp.get("href").getAsString();
            String imagen = temp.get("image").getAsString();
            
                JsonArray levelsArray = temp.getAsJsonArray("levels");
                String[] levels = levelsArray != null ? new String[levelsArray.size()] : new String[0];
                if (levelsArray != null) {
                    for (int j = 0; j < levelsArray.size(); j++) {
                        levels[j] = levelsArray.get(j).getAsJsonObject().get("level").getAsString();
                    }
                }

                JsonArray typesArray = temp.getAsJsonArray("types");
                String[] types = typesArray != null ? new String[typesArray.size()] : new String[0];
                if (typesArray != null) {
                    for (int j = 0; j < typesArray.size(); j++) {
                        types[j] = typesArray.get(j).getAsJsonObject().get("type").getAsString();
                    }
                }

                JsonArray attributesArray = temp.getAsJsonArray("attributes");
                String[] attributes = attributesArray != null ? new String[attributesArray.size()] : new String[0];
                if (attributesArray != null) {
                    for (int j = 0; j < attributesArray.size(); j++) {
                        attributes[j] = attributesArray.get(j).getAsJsonObject().get("attribute").getAsString();
                    }
                }
        listadijimon[i] = new Digimon(id, nombre, url, imagen, levels, types, attributes);
            


          Digicard tarjeta = new Digicard(listadijimon[i]);
          int pos = i;
            Panel_Digimones.add(tarjeta);
           tarjeta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.print("DIGIMONES");
                    Habilidades carta = new Habilidades(listadijimon[pos]);
                    carta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    carta.setVisible(true);
                }
            });
        }
        Panel_Digimones.repaint();
        Panel_Digimones.revalidate();
    
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_img = new javax.swing.JLabel();
        Panel_Digimones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_img.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etq_img.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Panel_Digimones.setLayout(new java.awt.GridLayout(2, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Panel_Digimones, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Digimones, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Digimones;
    private javax.swing.JLabel etq_img;
    // End of variables declaration//GEN-END:variables
}
