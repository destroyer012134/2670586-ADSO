import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*; // para eventos de clickç


public class Promedio  extends JFrame{

    JLabel listaJLabels [];
    JTextField campo_materia;
    JTextField campo_creditos;
    JTextField campo_nota;
    JLabel etq_total;
    double notastotales = 0;
    double creditostotales = 0;
   
    //initcomponent para  visualizar elem
    //constructor
    public Promedio   (){
        initComponent();
        
    }


    public void initComponent(){
        this.listaJLabels = new JLabel [50];

        setTitle("Promedio Ponderado"); 
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );

        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); // para no estirar la ventana

        
        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.white); // O CON new Color(0,0,0)
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("CALCULAR PROMEDIO");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        etq_titulo.setBackground(Color.BLACK); 
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 0;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 30; // todo el ancho 
        restricciones.weightx = 0; // filas
        restricciones.insets = new Insets(0,10,20,10);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_titulo, restricciones);
        restricciones.insets = new Insets(0,0,0,0);


        
        JLabel etq_materia = new JLabel();
        etq_materia.setText("Materia:");
        etq_materia.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        restricciones.insets = new Insets(5,0,0,0);// margen dentro de la celda
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_materia, restricciones);
        restricciones.insets = new Insets(0,0,0,0);// margen dentro de la celda
       


         campo_materia = new JTextField();
        campo_materia.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5,0,0,0);// margen dentro de la celda
        contenedor.add(campo_materia, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);



        JLabel etq_creditos = new JLabel();
        etq_creditos.setText("Creditos:");
        etq_creditos.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 2;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        restricciones.insets = new Insets(5,5,0,0);// margen dentro de la celda
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_creditos, restricciones);
        restricciones.insets = new Insets(0,0,0,0);// margen dentro de la celda
     
       


         campo_creditos = new JTextField();
        campo_creditos.setColumns(10);
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5,0,0,0);// margen dentro de la celda
        contenedor.add(campo_creditos, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


        
        JLabel etq_nota = new JLabel();
        etq_nota.setText("Nota:");
        etq_nota.setFont(new Font("Arial", Font.BOLD, 20));
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        restricciones.insets = new Insets(5,0,0,0);// margen dentro de la celda
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nota, restricciones);
        restricciones.insets = new Insets(0,0,0,0);// margen dentro de la celda
       


        campo_nota = new JTextField();
        campo_nota.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5,0,0,0);// margen dentro de la celda
        contenedor.add(campo_nota, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


        JButton btn_registrar = new JButton();
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setFont( new Font("Arial", Font.BOLD, 15) );
        btn_registrar.setBackground(Color.BLUE);
        btn_registrar.setForeground(Color.WHITE);
        restricciones.gridx = 2;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5,5,0,0);// margen dentro de la celda
        contenedor.add(btn_registrar, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  // para reestablecer el tamaño




        JLabel etq_resumen = new JLabel();
        etq_resumen.setText("RESUMEN");
        etq_resumen.setFont(new Font("Arial", Font.BOLD, 20));
        etq_resumen.setHorizontalAlignment(JLabel.CENTER);
        etq_resumen.setBackground(Color.BLACK); 
        restricciones.gridx = 0; //coordenada en X
        restricciones.gridy = 3;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1; // 1 celda a lo alto
        restricciones.weightx = 30; // todo el ancho 
        restricciones.weightx = 0; // filas
        restricciones.insets = new Insets(20,10,10,10);
        restricciones.fill = GridBagConstraints.BOTH; // para decirle como se va a distribuir 
        contenedor.add(etq_resumen, restricciones);
        restricciones.insets = new Insets(0,0,0,0);



        JPanel contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restricciones.gridy = 4;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 4;
        restricciones.weighty = 20;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 0, 10);
        contenedor.add( scrollPane, restricciones );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderColor );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }


         etq_total = new JLabel(); 
        etq_total.setText("Total: ");
        etq_total.setFont(new Font("Arial", Font.BOLD, 20));
         etq_total.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 30;
        restricciones.weighty = 0;
        restricciones.insets = new Insets(10,0,0,0);
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_total, restricciones);
        restricciones.insets = new Insets(0,0,0,0);
        


        JButton btn_limpiar = new JButton();
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.setFont( new Font("Arial", Font.BOLD, 15) );
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5,5,0,0);// margen dentro de la celda
        contenedor.add(btn_limpiar, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);  // para reestablecer el tamaño

        

        add(contenedor);
        setVisible(true);
        revalidate(); //renderizar correctamente los elementos

        ActionListener evento_click_registrar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				registrar();
			}
		};
		btn_registrar.addActionListener(evento_click_registrar);




         ActionListener evento_click_limpiar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				limpiartodo();
			}
		};
		btn_limpiar.addActionListener(evento_click_limpiar);

    }

    public void registrar() {
        String materia = campo_materia.getText();
        double creditos = Double.parseDouble(campo_creditos.getText());
        double nota = Double.parseDouble(campo_nota.getText());
    
       
    
        for (int i = 0; i < listaJLabels.length; i++) {
            if (listaJLabels[i].getText().equals(" ")) {
                listaJLabels[i].setText(materia + " -> Creditos:" + creditos + " -> Nota: " + nota);
                notastotales += (nota * creditos);
                creditostotales += creditos;
    
               
                    double promedio = notastotales / creditostotales;
                    etq_total.setText("Total: " + promedio);
                
    
                break;
            }
        }
    
        limpiarcampo();
    }
    


    public void limpiartodo() {
        campo_materia.setText(null);
        campo_creditos.setText(null);
        campo_nota.setText(null);
        etq_total.setText(null);
    
        for (int i = 0; i < listaJLabels.length; i++) {
            listaJLabels[i].setText(" ");
                
        }
        
    

	}

    public void limpiarcampo() {
        campo_materia.setText(null);
        campo_creditos.setText(null);
        campo_nota.setText(null);
     


	}



}


