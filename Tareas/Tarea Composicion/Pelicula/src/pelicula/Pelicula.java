/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelicula;

/**
 *
 * @author User
 */
public class Pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PeliculaTarea miPeli = new PeliculaTarea();
         miPeli.setNombrePeli("Shrek ");
         miPeli.setDirec(new Director ("Vicky Jenson, Andrew Adamson", 5 , 45));
         miPeli.setProta(new Actor ("Mike myers", 58, "Ingles"));
         miPeli.setCasa(new Pruductora ("Paramount",1912));
          System.out.println( miPeli );
    }
   
    
     //miCompu.setMarca("Asus");
       // miCompu.setCpu(new Procesador("Intel", 2.6f));
       // System.out.println( miCompu );
        //miCompu.getCpu().setMarca("AMD");
        //miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        //System.out.println(miCompu );
     
}
