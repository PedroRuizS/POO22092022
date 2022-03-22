/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author User
 */
public class PeliculaTarea {
    private String NombrePeli;
    private Director direc;
    private Actor prota;
    private Pruductora casa;

    public PeliculaTarea() {
        direc = new Director();
        prota = new Actor();
        casa = new Pruductora();
    }

    public PeliculaTarea(String NombrePeli, Director direc, Actor prota, Pruductora casa) {
        this.NombrePeli = NombrePeli;
        this.direc = direc;
        this.prota = prota;
        this.casa = casa;
    }

    public Pruductora getCasa() {
        return casa;
    }

    public void setCasa(Pruductora casa) {
        this.casa = casa;
    }

    public String getNombrePeli() {
        return NombrePeli;
    }

    public void setNombrePeli(String NombrePeli) {
        this.NombrePeli = NombrePeli;
    }

    public Director getDirec() {
        return direc;
    }

    public void setDirec(Director direc) {
        this.direc = direc;
    }

    public Actor getProta() {
        return prota;
    }

    public void setProta(Actor prota) {
        this.prota = prota;
    }

    @Override
    public String toString() {
        return "PeliculaTarea{" + "NombrePeli=" + NombrePeli + ", direc=" + direc + ", prota=" + prota + ", casa=" + casa + '}';
    }
        
}
