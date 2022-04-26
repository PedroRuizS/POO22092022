/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabientajava;

/**
 *
 * @author User
 */
public class CuentaHabiente {
   private int idCliente;
   private String Nombre;
   private float Balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String Nombre, float Balance) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Balance = Balance;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", Nombre=" + Nombre + ", Balance=" + Balance + '}';
    }
   
  public void retirarDinero( float monto ){
            //código para restarle el monto al balance
            
            this.Balance= Balance-monto;
            System.out.println("Tu balance despues de la transccion es  "+monto);
            
}
    public String evaluarNivelCliente(){
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
            if (Balance > 50000) {
                System.out.println("Usted es Cliente Premium, un saludo cordial");
            
        }else{
                System.out.println("Eres de los plebeyos, largo de aqui");
            }
       return null;
            
}
}
