/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librotarea;

/**
 *
 * @author User
 */
public class Editorial {
    private String Nombre;
    private int Fundacion;

    public Editorial() {
    }

    public Editorial(String Nombre, int Fundacion) {
        this.Nombre = Nombre;
        this.Fundacion = Fundacion;
    }

    public int getFundacion() {
        return Fundacion;
    }

    public void setFundacion(int Fundacion) {
        this.Fundacion = Fundacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", Fundacion=" + Fundacion + '}';
    }
    
    
}
