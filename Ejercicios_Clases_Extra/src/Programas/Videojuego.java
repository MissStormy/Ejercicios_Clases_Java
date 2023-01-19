
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
    
    //Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_est() {
        return horas_est;
    }

    public void setHoras_est(int horas_est) {
        this.horas_est = horas_est;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }
    
}
