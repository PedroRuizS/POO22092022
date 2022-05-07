/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaBasicoParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList <String>();
        nombres.add("Alma");
        nombres.add("Barolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        for (String nombre: nombres ){
            System.out.println(nombre);
        }
        System.out.println("-----------");
        Scanner teclado = new Scanner(System.in);
        int seleccion = teclado.nextInt();
        String elNombre = "";
        try {
            seleccion = teclado.nextInt();
            elNombre= nombres.get(seleccion);
                
        }catch(InputMismatchException ie ){
            System.out.println("Debes teclear valores numericos");
        } 
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Error, debes de ingresar valor entre 0 y 4");
            elNombre= nombres.get(0);
        }finally{
            System.out.println(elNombre);
        }
        
        //System.out.println(nombres.get( seleccion ));
        System.out.println("Continua el programa ....");
        Aritmetica cal = new Aritmetica(2,4);
        System.out.println("Fin del programa");
        Cuadrado cuad = new Cuadrado (5.0f);
        Circulo circ = new Circulo (3.4f);
        System.out.println("El circulo"+circ);
        System.out.println("El cuadrado"+ cuad);
        
        System.out.println("-------------------------");
        EstudianteDeportistaArtista eda=new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografia,Estampa,Dibujo");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
        
        

    }
    
}
