/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author User
 */
public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Actor() {
    }

    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
