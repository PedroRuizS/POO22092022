/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacion.de.codigo;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String ("Juan Gabriel");
        System.out.println( nombre );
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        /*JFrame ventana = new JFrame("Mi primer Ventana Java :o");
        ventana.setSize(600,400);
        ventana.setVisible(true);
        */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu );
        
        Computadora compu2 = new Computadora ("Apple", "MacBook Pro", new Monitor ("Toshiba", 14.3f),
                new Mouse("Razer", "Optico"), new Teclado ("Apple", 101),new Procesador ("M1", 3.4f));
                System.out.println(compu2 );
                    compu2.getRaton().setMarca("Apple");
                    compu2.getRaton().setTipo("Touch");
        System.out.println("");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Martin");
        
        System.out.println("-------------------Composicion y herencia en la misma clase---------------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setMarca("HP");
        server.setRaton(new Mouse("LG", "optico"));
        server.getRaton().setMarca("Logitech");

        
        
        System.out.println("-----------Polimorfismo------------");
        Perro dog = new Perro("Bulldog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
    }
    
}
