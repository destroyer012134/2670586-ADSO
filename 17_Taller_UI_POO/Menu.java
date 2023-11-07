
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
    


    public Menu(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Factura"); 
        setSize(800, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restrincciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS DE CLIENTE: ");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restrincciones.gridx = 0;
        restrincciones.gridy = 0;
        restrincciones.gridwidth = 2;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 1;
        restrincciones.weighty = 0;
        contenedor.add(etq_titulo, restrincciones); 

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA: ");
        restrincciones.gridx = 0; 
        restrincciones.gridy = 1; 
        restrincciones.gridwidth = 1; 
        restrincciones.gridheight = 1;
        restrincciones.weightx = 0;
        restrincciones.weighty = 0;
        contenedor.add(etq_cedula, restrincciones);

        JTextField campo_cedula = new JTextField(15);
        restrincciones.gridx = 1; 
        restrincciones.gridy = 1; 
        restrincciones.gridwidth = 1; 
        restrincciones.gridheight = 1;
        restrincciones.weightx = 1;
        restrincciones.weighty = 0;
        contenedor.add(campo_cedula, restrincciones);

        
        JButton boton_buscar = new JButton("Buscar");
        restrincciones.gridx = 2;
        restrincciones.gridy = 1;
        restrincciones.gridwidth = 1;
        restrincciones.gridheight = 1;
        restrincciones.weightx = 0;
        restrincciones.weighty = 0;
        contenedor.add(boton_buscar, restrincciones);

        JLabel etq_nombre = new JLabel();
        etq_nombre.setText("Nombre: ");
        restrincciones.gridx = 0; 
        restrincciones.gridy = 2; 
        restrincciones.gridwidth = 1; 
        restrincciones.gridheight = 1;
        restrincciones.weightx = 0;
        restrincciones.weighty = 0;
        contenedor.add(etq_nombre, restrincciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("Dirección: ");
        restrincciones.gridx = 0; 
        restrincciones.gridy = 3; 
        restrincciones.gridwidth = 1; 
        restrincciones.gridheight = 1;
        restrincciones.weightx = 0;
        restrincciones.weighty = 0;
        contenedor.add(etq_direccion, restrincciones);

        add(contenedor);
        setVisible(true);
        revalidate();
        
    }
}
