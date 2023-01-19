/*
 * La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá 
los siguientes métodos:

· Constructor por defecto.

· Constructor con parámetros.

· Métodos Setters/getters

· Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. 
No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar 
la operación y false en caso contrario.

· Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán 
devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.

· Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) 
para adaptarlo a la clase Libro.
 */
package Ejercicio_4;

/**
 *
 * @author Dungeon Larimaster
 */
public class Libro {
    //Atributos: declaramos los datos que va a contener la clase
    String titulo;
    String autor;
    int num_ejemplares;
    int num_ejem_pres;
    
    //Constructores: nos sirven para llamar a los atributos, tenemos el constructor por defecto (vacio) y el de parametros (con this)
    public Libro(){
        
    }
    public Libro(String titulo, String autor, int num_ejemplares, int num_ejem_pres){
        this.titulo = titulo;
        this.autor = autor;
        this.num_ejemplares = num_ejemplares;
        this.num_ejem_pres = num_ejem_pres;
    }
    
    //Metodos: tenemos dos tipos, los setters y getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public int getNum_ejem_pres() {
        return num_ejem_pres;
    }

    public void setNum_ejem_pres(int num_ejem_pres) {
        this.num_ejem_pres = num_ejem_pres;
    }
    
    //Y los que generaran funciones
    
    //método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (num_ejem_pres < num_ejemplares) {
            num_ejem_pres++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (num_ejem_pres == 0) {
            devuelto = false;
        } else {
            num_ejem_pres--;
        }
        return devuelto;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + num_ejemplares + "\nprestados: " + num_ejem_pres;                                    
    }
   
}
