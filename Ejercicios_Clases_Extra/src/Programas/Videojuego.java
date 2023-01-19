
package Programas;

/**
 *
 * @author Dungeon Larimaster
 */
public class Videojuego {
    //Atributos
    String titulo;
    int horas_est;
    boolean entregado;
    String genero;
    String companyia;
    
    //Constantes
    public static final int HORAS_DEF = 10;
    public static final boolean ENT_DEF = false;
    
    //Constructores
    public Videojuego(String titulo, int horas_est, boolean entregado, String genero, String companyia){
        this.titulo = titulo;
        this.horas_est = horas_est;
        this.entregado = entregado;
        this.genero = genero;
        this.companyia = companyia;
    }
    public Videojuego(){
        this("",HORAS_DEF,ENT_DEF,"","");
    }
    
    
}
