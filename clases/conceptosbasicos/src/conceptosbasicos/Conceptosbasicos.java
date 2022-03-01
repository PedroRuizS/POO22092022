/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;
import ico.fes.automovil;
import ico.fes.silla;
import java.awt.Color;
/**
 *
 * @author User
 */
public class Conceptosbasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        automovil miBocho=new automovil();
        System.out.println(miBocho);
        miBocho.setColor(Color.GREEN);
        miBocho.setMarca("VW");
        miBocho.setModelo(1970);
        System.out.println(miBocho);
        
        automovil miMustang=new automovil ("Ford","Mustang",2010,Color.red);
        System.out.println(miMustang);
            
        
        automovil miAcura=new automovil ("acura","Acura",2009,Color.blue);
        System.out.println(miAcura);
        }
    }

