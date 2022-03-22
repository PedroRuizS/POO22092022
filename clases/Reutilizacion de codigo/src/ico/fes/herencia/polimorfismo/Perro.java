/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author User
 */
public class Perro extends Animal {
 private String Raza;
 private String Pedigree;

    public Perro() {
    }

    public Perro(String Raza, String Pedigree) {
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    public Perro(String Raza, String Pedigree, int numPatas) {
        super(numPatas);
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getPedigree() {
        return Pedigree;
    }

    public void setPedigree(String Pedigree) {
        this.Pedigree = Pedigree;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", Pedigree=" + Pedigree + '}';
    }
   
    @Override
    public void emitirSonido(){       
    System.out.println("emitiendo sonido... GUAU GUAU ");}
 
}
