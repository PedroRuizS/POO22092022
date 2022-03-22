/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author User
 */
public class Pruductora {
    private String nombreC;
    private int funacion;

    public Pruductora() {
    }

    public Pruductora(String nombreC, int funacion) {
        this.nombreC = nombreC;
        this.funacion = funacion;
    }

    public int getFunacion() {
        return funacion;
    }

    public void setFunacion(int funacion) {
        this.funacion = funacion;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return "Pruductora{" + "nombreC=" + nombreC + ", funacion=" + funacion + '}';
    }


    
}
