/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librotarea;

/**
 *
 * @author User
 */
public class Autor {
    private String nombre;
    private int edad;
    private int escritos;

    public Autor() {
    }

    public Autor(String nombre, int edad, int escritos) {
        this.nombre = nombre;
        this.edad = edad;
        this.escritos = escritos;
    }

    public int getEscritos() {
        return escritos;
    }

    public void setEscritos(int escritos) {
        this.escritos = escritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + ", escritos=" + escritos + '}';
    }
    
    public String escribir (int escritos){
    escritos  = 4;
    String cotorreo = "El escritor ha escrito "+ escritos + "libros best seller";
    return cotorreo;
    
    
}
    
    
}
