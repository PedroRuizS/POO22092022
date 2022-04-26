/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabientajava;

/**
 *
 * @author User
 */
public class CuentaHabienteJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       CuentaHabiente[] lista = new CuentaHabiente[5]; // 5 alumnos
        lista[0] = new CuentaHabiente(99999, "Javier", 90000.0f);
        lista[1] = new CuentaHabiente(77777, "Martha", 7000.0f);
        lista[2] = new CuentaHabiente(55555, "Rafael", 70000.0f);
        lista[3] = new CuentaHabiente(88888, "Pedro", 8000.0f);
        lista[4] = new CuentaHabiente(66666, "Alicia", 60000.0f);
        for (CuentaHabiente PruebaEjemplo : lista) {
            System.out.println(PruebaEjemplo.evaluarNivelCliente());
        }
    
    }
    
    
    
}
