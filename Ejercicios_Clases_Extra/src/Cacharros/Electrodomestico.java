
package Cacharros;

/**
 *
 * @author Dungeon Larimaster
 */
public class Electrodomestico {
    //Atributos
    double precioBase;
    String color;
    char consumo;
    double peso;
    
    //Constantes
    public static final String COLOR_DEF = "BLANCO";
    public static final char CONS_DEF = 'F';
    public static final double PREC_BASE = 100;
    public static final double PESO_DEF = 5;
    
    //Constructores
    //Constructor por defecto
    public Electrodomestico(){
        this(PREC_BASE, COLOR_DEF, CONS_DEF, PESO_DEF);
    }
    //Constructor con parametros
    public Electrodomestico(double precioBase, String color, char consumo, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso; 
    }
    //Constructor especifico
    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.color = COLOR_DEF;
        this.consumo = CONS_DEF;
        this.peso = peso;
    }
    
    //Metodos
    private void comprobarConsumoEnergetico(char letra){
        //Comprueba si la letra es correcta y si no, usa por defecto
        if(consumo>=65 && consumo<=70){
            this.consumo=consumo;
        }else{
            this.consumo=CONS_DEF;
        }
    }
    
    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }  
    }
    
    public double precioFinal(){
        double plus=0;
        switch(consumo){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return precioBase+plus;
    }
    
}
