
package Programas;

/**
 *
 * @author Dungeon Larimaster
 */
public class Serie {
    //Atributos
    String titulo;
    int num_temp;
    boolean entregado;
    String genero;
    String creador;
    
    //Constantes
    public static final int TEMP_DEF = 3;
    public static final boolean ENTREGADO_DEF = false;
    
    //Constructores
    public Serie(String titulo, int num_temp, boolean entregado, String genero, String creador){
        this.titulo = titulo;
        this.num_temp = num_temp;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }
    
    public Serie(){
        this("", TEMP_DEF, ENTREGADO_DEF, "", "");
    }
    
    public Serie(String titulo, String creador){
        
    }
    
}
