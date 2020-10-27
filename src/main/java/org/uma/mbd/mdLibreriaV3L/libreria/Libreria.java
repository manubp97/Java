package org.uma.mbd.mdLibreriaV3L.libreria;

import java.util.LinkedList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        libros = new LinkedList<>();
    }


    private int posicionLibro(String autor, String titulo) {
        int pos = 0;
        while (pos < numLibros && !(libros[pos].getAutor().equals(autor) && libros[pos].getTitulo().equals(titulo))) {
            pos++;
        }
        return (pos < numLibros) ? pos: -1;
    }


    public void addLibro(String autor, String titulo, double precioBase) {
        Libro libro= new Libro(autor, titulo, precioBase);
        addLibro(libro);
    }

    private void addLibro(Libro libro) {
        int pos = posicionLibro(libro.getAutor(), libro.getTitulo());
        if (pos >= 0) {
            // el libro está en la posición pos
            libros.set(pos, libro);
        } else {
            libros.add(libro);
        }
    }

    public void remLibro(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        if (pos >= 0) {
            libros.remove(pos);
    }

    public double getPrecioBase(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        return (pos >= 0)? libros[pos].getPrecioBase() : 0;
    }

    public double getPrecioFinal(String autor, String titulo) {
        int pos = posicionLibro(autor, titulo);
        return (pos >= 0)? libros.get(pos).getPrecioFinal() : 0;
    }

    @Override
    public String toString() {
       return libros.toString();
    }
}
