/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author User
 */
public class Teclado {
    private String Teclado;
    private int Teclas;

    public Teclado() {
    }

    public Teclado(String Teclado, int Teclas) {
        this.Teclado = Teclado;
        this.Teclas = Teclas;
    }

    public int getTeclas() {
        return Teclas;
    }

    public void setTeclas(int Teclas) {
        this.Teclas = Teclas;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Teclado=" + Teclado + ", Teclas=" + Teclas + '}';
    }
    
}
