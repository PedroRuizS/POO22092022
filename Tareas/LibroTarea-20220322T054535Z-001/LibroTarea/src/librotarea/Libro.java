/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librotarea;

/**
 *
 * @author User
 */
public class Libro {
    private String Nombre;
    private Editorial editor;
    private Autor escritor;

    public Libro() {
        editor = new Editorial();
        escritor = new Autor();
    }

    public Libro(String Nombre, Editorial editor, Autor escritor) {
        this.Nombre = Nombre;
        this.editor = editor;
        this.escritor = escritor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Editorial getEditor() {
        return editor;
    }

    public void setEditor(Editorial editor) {
        this.editor = editor;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nombre=" + Nombre + ", editor=" + editor + ", escritor=" + escritor + '}';
    }

    
}
