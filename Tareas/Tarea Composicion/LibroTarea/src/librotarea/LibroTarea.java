/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librotarea;

/**
 *
 * @author User
 */
public class LibroTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro miLibro = new Libro ();
        miLibro.setNombre("Principito");
        miLibro.setEscritor(new Autor ("Antoine de Saint-Exupéry",122, 45));
        miLibro.setEditor(new Editorial("ILCE",1992));
        System.out.println(miLibro);
    }
    
}
