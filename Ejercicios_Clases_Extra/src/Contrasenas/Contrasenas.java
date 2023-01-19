/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Contrasenas;
import java.util.*;
/**
 *
 * @author Dungeon Larimaster
 */
public class Contrasenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int lon;
        //int cont;
        
        Password password1 = new Password(5, 12345);
        Password password2 = new Password();
        
        System.out.println("Introduce longitud de contrasenya: ");
        lon = ent.nextInt();
        //System.out.println("Introduce contrasenya: ");
        //cont = ent.nextInt();
        
        password2.setLongitud(lon);
        //password2.setContrasenya(cont);
        
        System.out.println("Contrasenya 1: ");
        System.out.println("Longitud: " + password1.getLongitud());
        System.out.println("Contrasenya: " + password1.getContrasenya());
        System.out.println("Fuerte: " + password1.esFuerte());
        System.out.println();
        
        System.out.println("Contrasenya 2: ");
        System.out.println("Longitud: " + password2.getLongitud());
        System.out.println("Contrasenya: " + password2.generarPassword());
        System.out.println("Fuerte: " + password2.esFuerte());
        System.out.println();
    }
    
}
