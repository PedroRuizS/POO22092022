/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author User
 */
public class Director {
    private String nombre;
    private int peliculas;
    private int edad;

    public Director() {
    }

    public Director(String nombre, int peliculas, int edad) {
        this.nombre = nombre;
        this.peliculas = peliculas;
        this.edad = edad;
    }

    Director(String eso_tilin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(int peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", peliculas=" + peliculas + ", edad=" + edad + '}';
    }
    public String Dirigidas (int dirigidas){
    dirigidas = 9;
    String cotorreo = "El director ha dirigido"+ dirigidas + "peliculas chidas";
    return cotorreo;
    
    
}
    
    
    
    
    
}
