
package Principal;

import javax.swing.table.DefaultTableModel;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.ConsumoAPI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;


public class Pokemen extends javax.swing.JFrame {

    DefaultTableModel  modelo;
    ConsumoAPI consumo = new ConsumoAPI();
    
    public Pokemen() {
        initComponents();
        initAlternComponents();
        datospokemon();
    }
    
    
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
     
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("img/pokebola.png")));
        
        modelo = (DefaultTableModel) lista_habilidades.getModel();
        
        lista_habilidades.getTableHeader().setReorderingAllowed(false);
        lista_habilidades.getTableHeader().setResizingAllowed(false);
       
        lista_habilidades.getColumnModel().getColumn(0).setPreferredWidth(50);
        lista_habilidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        lista_habilidades.getColumnModel().getColumn(2).setPreferredWidth(250);
      
        
        repaint();
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapokemon = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_nombre_pokemon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_habilidades = new javax.swing.JTable();
        etq_img_pokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout listapokemonLayout = new javax.swing.GroupLayout(listapokemon);
        listapokemon.setLayout(listapokemonLayout);
        listapokemonLayout.setHorizontalGroup(
            listapokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        listapokemonLayout.setVerticalGroup(
            listapokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(listapokemon);

        etq_titulo.setBackground(new java.awt.Color(255, 255, 255));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 37)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/juego.png"))); // NOI18N
        etq_titulo.setText("POKEDEX");

        etq_nombre_pokemon.setBackground(new java.awt.Color(255, 255, 255));
        etq_nombre_pokemon.setFont(new java.awt.Font("Arial", 1, 31)); // NOI18N
        etq_nombre_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lista_habilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad", "Url"
            }
        ));
        jScrollPane2.setViewportView(lista_habilidades);

        etq_img_pokemon.setBackground(new java.awt.Color(255, 255, 255));
        etq_img_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_nombre_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_nombre_pokemon)
                        .addGap(38, 38, 38)
                        .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void datospokemon() {
        String respuesta = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        JsonObject jsonResponse = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray results = jsonResponse.getAsJsonArray("results");

        listapokemon.removeAll();
        listapokemon.setLayout(new GridLayout(0, 1));

        for (int i = 0; i < results.size(); i++) {
            JsonObject pokemon = results.get(i).getAsJsonObject();
            String pokemonName = pokemon.get("name").getAsString();
            String pokemonUrl = pokemon.get("url").getAsString();
            JButton button = new JButton(pokemonName);

            button.setContentAreaFilled(false);
            button.setFocusPainted(true);
            button.setBackground(new Color(255, 255, 255));
            button.setForeground(new Color(0, 0, 0));
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    detallepokemon(pokemonUrl);
                }
            });
            listapokemon.add(button);
        }

        listapokemon.revalidate();
        listapokemon.repaint();
    }

   public void detallepokemon(String endpoint) {
        try {
            String respuesta = consumo.consumoGET(endpoint);
            JsonObject data = JsonParser.parseString(respuesta).getAsJsonObject();
            etq_nombre_pokemon.setText(data.get("name").getAsString().toUpperCase());

            JsonObject sprites = data.getAsJsonObject("sprites");
            String imgUrl = sprites.getAsJsonObject("other")
                    .getAsJsonObject("official-artwork")
                    .get("front_default").getAsString();

            Image image = ImageIO.read(new URL(imgUrl));
            Image resizedImage = image.getScaledInstance(272, 254, Image.SCALE_SMOOTH);
            etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
            etq_img_pokemon.setText("");

            modelo.setRowCount(0);
            JsonArray abilities = data.getAsJsonArray("abilities");
            for (int i = 0; i < abilities.size(); i++) {
                JsonObject ability = abilities.get(i).getAsJsonObject().getAsJsonObject("ability");
                modelo.addRow(new Object[]{i + 1, ability.get("name").getAsString(), ability.get("url").getAsString()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            etq_img_pokemon.setIcon(null);
            etq_img_pokemon.setText("Error: problemas para cargar la imagen");
        }
    }
   




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_img_pokemon;
    private javax.swing.JLabel etq_nombre_pokemon;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lista_habilidades;
    private javax.swing.JPanel listapokemon;
    // End of variables declaration//GEN-END:variables
}
