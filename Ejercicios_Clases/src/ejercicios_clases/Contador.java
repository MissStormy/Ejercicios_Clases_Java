/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_clases;

/**
 *
 * @author Dungeon Larimaster
 */
public class Contador {
    
    int cont;
    
    public Contador(int cont){
        this.cont = 1;
    }
    public Contador(){
        
    }
    public Contador(Contador contador){
        this.cont = contador.getCont();
    }
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public boolean Positivo(int cont){
        if(cont<0){
            cont = 0;
            return false;
        }
        else{
            cont = cont;
            return true;
        }
    }
    
    public void Incrementar(int cont){
        cont++;
    }
    public void Decrementar(int cont){
        if(cont==0){
            cont = 0;
        }
        else{
            cont--;
        }
    }
}
