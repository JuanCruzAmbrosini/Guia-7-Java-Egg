/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan Cruz
 */
public class Libro {
    
    public String isbn;
    public String titulo;
    public String autor;
    public int cantPaginas;

    public Libro() {
    }
    
    public Libro ( String isbn, String titulo, String autor, int cantPaginas  ) {
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        
        
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", cantPaginas=" + cantPaginas + '}';
    }
    
}
