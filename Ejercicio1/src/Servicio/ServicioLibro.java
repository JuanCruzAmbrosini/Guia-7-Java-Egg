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

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {

        Libro nuevoLibro = new Libro();
        
        System.out.println("Ingrese el ISBN del libro: ");
        nuevoLibro.isbn = leer.next();

        System.out.println("Ingrese el título del libro: ");
        nuevoLibro.titulo = leer.next();

        System.out.println("Ingrese el autor del libro: ");
        nuevoLibro.autor = leer.next();

        System.out.println("Ingrese la cantidad de páginas del libro: ");
        nuevoLibro.cantPaginas = leer.nextInt();

        return nuevoLibro;

    }

    
    public void mostrarLibro(Libro nuevoLibro) {

        System.out.println(nuevoLibro.toString());

    }

}
