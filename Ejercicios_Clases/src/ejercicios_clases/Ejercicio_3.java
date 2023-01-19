/*
 * 
 * 
 */
package ejercicios_clases;

import java.util.*;

/**
 *
 * @author Dungeon Larimaster
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int cont;
        int opc = 0;
        int pos;
        Contador contador = new Contador();

        System.out.println("Introduce el primer valor del contador");
        cont = ent.nextInt();
        contador.Positivo(cont);
        
        
        while (opc != 3) {
            System.out.println("Que quieres?");
            System.out.println("1. Incrementar");
            System.out.println("2.Decrementar");
            System.out.println("3.Salir");
            opc = ent.nextInt();

            if (opc == 1) {
                System.out.println("Introduce numero: ");
                cont = ent.nextInt();
                
                contador.Incrementar(cont);
            }else if(opc == 2){
                System.out.println("Introduce numero: ");
                cont = ent.nextInt();
                
                contador.Decrementar(cont);
            }else{
                System.out.println("Chau");
            }

            

            System.out.println(contador.getCont());
        }

    }

}
