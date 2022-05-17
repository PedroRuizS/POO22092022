/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VentanaCodigo1 extends JFrame{
 private JTextField texto,llave;
    private JButton boton;
    private JLabel resultado;

    public VentanaCodigo1() throws HeadlessException {
   
        setTitle("Cifrado César");
        setSize(400,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        texto = new JTextField(10);
        llave = new JTextField(10);
        boton = new JButton("Cifrar texto");
        boton.setBackground(Color.red);
        boton.setOpaque(true);
        resultado = new JLabel("Aquí va texto cifrado");
        
        this.getContentPane().add(texto);
        this.getContentPane().add(llave);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
  this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                byte[] bytes;
                int key;
                String fin = "";
                
                bytes = texto.getText().getBytes();
                key = Integer.parseInt(llave.getText());
                
                try {
                    for (byte aByte : bytes) {
                        int num = aByte;
                        String tipo = "";
                        tipo = (num >= 65 && num <= 90) ? "M" : (num >= 97 && num <= 122) ? "m" : "X";
                        num += key;
                        //Mayúscula
                        num = (num >= 90 && tipo == "M") ? (num % 90) + 64 : num;
                        //Minúscula
                        num = (num >= 122 && tipo == "m") ? (num % 122) : num;

                        fin = fin + Character.toString(num);

                        System.out.println(num);
                        //System.out.println(s);
                    }
                    resultado.setText(fin);
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "intoduce un valor correcto", "Error de captura ", JOptionPane.ERROR_MESSAGE);
                }
                }

            }
        );
    }

}
