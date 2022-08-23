/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {

        System.out.println("Ingrese el ISBN del libro: ");
        String isbn = leer.nextLine();

        System.out.println("Ingrese el título del libro: ");
        String titulo = leer.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.nextLine();

        System.out.println("Ingrese la cantidad de páginas del libro: ");
        int cantPaginas = leer.nextInt();
        leer.nextLine();

        Libro nuevoLibro = new Libro(isbn, titulo, autor, cantPaginas);

        return nuevoLibro;

    }

    
    public void mostrarLibro(Libro nuevoLibro) {
        
        System.out.println(nuevoLibro.toString());
        
    }

}
