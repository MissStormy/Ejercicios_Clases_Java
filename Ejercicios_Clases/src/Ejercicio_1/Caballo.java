/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Dungeon Larimaster
 */
public class Caballo {
    //Atributos
    
    String nombre;
    String raza;
    String color;
    String sexo;
    int edad;
    
    //Constructor
    
    public Caballo(String nombre, String raza, String color, String sexo, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    //gettes y settes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String mensaje = "El caballo se llama " + nombre + " " + raza + " " + color + " " + sexo + " " + edad;
        return mensaje;
    }
}
