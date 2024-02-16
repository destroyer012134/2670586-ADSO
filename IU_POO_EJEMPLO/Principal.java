import javax.swing.*;
import java.awt.*;

public class Principal{
    public static void main(String[] args) {
        JFrame ventana01 = new JFrame();
        ventana01.setTitle("Primer Ventana");
        ventana01.setVisible(true);
        ventana01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana01.setSize(500, 500);
        ventana01.setSize(new Dimension(600,500));
        ventana01.setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        
        JLabel etiqueta_titulo = new JLabel();
        etiqueta_titulo.setText("TITULO");
        etiqueta_titulo.setFont(new Font("Snap ITC", Font.BOLD, 30));
        etiqueta_titulo.setBackground(Color.YELLOW);
        etiqueta_titulo.setForeground(Color.RED);
        etiqueta_titulo.setOpaque(true);

        
        JLabel etiqueta_Cedula = new JLabel();
        etiqueta_Cedula.setText("Cedula");
        etiqueta_Cedula.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField campo_Cedula = new JTextField();
        campo_Cedula.setColumns(10);


        JLabel etiqueta_nombre = new JLabel();
        etiqueta_nombre.setText("Nombre");
        etiqueta_nombre.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(10);
    

        JLabel etiqueta_apellido = new JLabel();
        etiqueta_apellido.setText("Apellido");
        etiqueta_apellido.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(10);
        JButton boton_apellido = new JButton("ENVIAR");

        


       
        contenedor.add(etiqueta_titulo);
        contenedor.add(etiqueta_Cedula);
        contenedor.add(campo_Cedula);
        contenedor.add(etiqueta_nombre);
        contenedor.add(campo_nombre);
        contenedor.add(etiqueta_apellido);
        contenedor.add(campo_apellido);
        contenedor.add(boton_apellido);
        
        
        ventana01.add(contenedor);
        
        //ventana01.repaint();
        //ventana01.revalidate();                     //renderizar
       // ventana01.pack();



        

    }
}