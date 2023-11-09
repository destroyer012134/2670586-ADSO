import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    public Menu() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Factura");
        setSize(800, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restricciones = new GridBagConstraints();

        // DATOS CLIENTES
        JLabel etq_datosCliente = new JLabel();
        etq_datosCliente.setText("DATOS CLIENTES: ");
        etq_datosCliente.setFont(new Font("Arial", Font.BOLD, 20));
        etq_datosCliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        contenedor.add(etq_datosCliente, restricciones);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA: ");
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        contenedor.add(etq_cedula, restricciones);

        JTextField campo_cedula = new JTextField(15);
        restricciones.gridx = 1;
        restricciones.gridwidth = 1;
        contenedor.add(campo_cedula, restricciones);

        JButton boton_buscarCliente = new JButton("Buscar");
        restricciones.gridx = 2;
        restricciones.gridwidth = 1;
        contenedor.add(boton_buscarCliente, restricciones);

        JLabel etq_nombre = new JLabel();
        etq_nombre.setText("Nombre: ");
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        contenedor.add(etq_nombre, restricciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("Direccion: ");
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        contenedor.add(etq_direccion, restricciones);

        JLabel etq_datosVendedor = new JLabel();
        etq_datosVendedor.setText("DATOS VENDEDOR: ");
        etq_datosVendedor.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        contenedor.add(etq_datosVendedor, restricciones);

        JLabel etq_cedulaVendedor = new JLabel();
        etq_cedulaVendedor.setText("CEDULA: ");
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        contenedor.add(etq_cedulaVendedor, restricciones);

        JTextField campo_cedulaVendedor = new JTextField(15);
        restricciones.gridx = 1;
        restricciones.gridwidth = 1;
        contenedor.add(campo_cedulaVendedor, restricciones);

        JButton boton_buscarVendedor = new JButton("Buscar");
        restricciones.gridx = 2;
        restricciones.gridwidth = 1;
        contenedor.add(boton_buscarVendedor, restricciones);

        JLabel etq_nombresVendedor = new JLabel();
        etq_nombresVendedor.setText("Nombres: ");
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        contenedor.add(etq_nombresVendedor, restricciones);

        JLabel etq_productos = new JLabel();
        etq_productos.setText("LISTA PRODUCTOS FACTURADOS: ");
        etq_productos.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 3;
        contenedor.add(etq_productos, restricciones);

        JLabel etq_id = new JLabel();
        etq_id.setText("ID");
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        contenedor.add(etq_id, restricciones);
        

        JLabel etq_nombreProducto = new JLabel();
        etq_nombreProducto.setText("NOMBRE");
        restricciones.gridx = 1;
        restricciones.gridwidth = 1;
        contenedor.add(etq_nombreProducto, restricciones);

        JLabel etq_cantidad = new JLabel();
        etq_cantidad.setText("CANT");
        restricciones.gridx = 2;
        restricciones.gridwidth = 1;
        contenedor.add(etq_cantidad, restricciones);

        JButton boton = new JButton("ADD");
        restricciones.gridx = 3;
        restricciones.gridwidth = 1;
        contenedor.add(boton, restricciones);


        JLabel etq_plan_pagos = new JLabel();
         etq_plan_pagos.setText("---");
         etq_plan_pagos.setFont(new Font("Arial", Font.BOLD, 18));
         etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 0;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
         contenedor.add(scroll, restricciones);


       


       
        add(contenedor);
        setVisible(true);
        revalidate();
    }
}
