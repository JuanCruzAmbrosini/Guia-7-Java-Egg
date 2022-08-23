/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio1;

import Entidades.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioLibro servLibro1 = new ServicioLibro();

        System.out.println("Libro 1: ");

        Libro libro1 = servLibro1.crearLibro();

        servLibro1.mostrarLibro(libro1);

        ServicioLibro servLibro2 = new ServicioLibro();

        System.out.println("Libro 2: ");

        Libro libro2 = servLibro2.crearLibro();

        servLibro2.mostrarLibro(libro2);

    }

}
