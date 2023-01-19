/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contrasenas;
import java.util.*;
/**
 *
 * @author Dungeon Larimaster
 */
public class Password {
    //Atributos 
    int longitud;
    int contrasenya;
    
    //Constantes
    public static final int LON_DEF = 8; 
    
    //Constructor por defecto
    public Password(){
        this(LON_DEF, 12345678);
    }
    
    //Constructor con longitud variable
    public Password(int longitud, int contrasenya){
        this.longitud = longitud;
        generarPassword();
        this.contrasenya = contrasenya;
        
    }
    
    //Metodos
    public boolean esFuerte(){
        if(longitud>5){
            //System.out.println("Es fuerte");
            return true;
        }
        else{
            //System.out.println("No es fuerte");
            return false;
        }
    }
    
    public int generarPassword(){
        Random rand = new Random();
        
        contrasenya = rand.nextInt(longitud);
        return contrasenya;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(int contrasenya) {
        this.contrasenya = contrasenya;
    }
    
    public String ToString(){
        return "Longitud: " + longitud + "Contrasenya: " + contrasenya;
    }
    
}
