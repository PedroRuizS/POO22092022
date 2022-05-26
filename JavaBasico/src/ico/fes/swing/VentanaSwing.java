/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VentanaSwing extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista;  
    private ModeloPersonaCombo modelo;
    private JTextArea texto;
    
    public VentanaSwing() throws HeadlessException {
    
       setTitle("Conversion de °C a °F");
       setSize(400,300);
       setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+"\\src\\ico\\fes\\swing\\car.png");
        boton = new JButton(icono);
        boton.setBackground(Color.red);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir");
        resultado = new JLabel("°F");
        ModeloPersonaCombo modelo;
        texto = new JTextArea(5, 20);
         /*
        lista.addItem("Ingeniería");
        lista.addItem("Derecho");
        lista.addItem("Periodismo");
        lista.addItem("Arquitectura");
        */
        modelo = new ModeloPersonaCombo();
        modelo.consultarBaseDatos(); //aquí array ya está lleno
        lista.setModel(modelo);
        
        
        
        
        
        
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing (WindowEvent e){
            System.exit(0);
        
        }
            
        });
                
   this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celsius = 0.0f;
                try {
                    //convierte texto a float
                    celsius = Float.parseFloat( cuadro.getText());
                    gradosFarenheit = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + " °F");
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "intoduce un valor correcto", "Error de captura ", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        });      
                
    
    }
    
    
    
}
