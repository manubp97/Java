package org.uma.mbd.mdLibreriaV2L.libreria;

import java.util.Arrays;

public class LibreriaOferta extends Libreria {
    private String [] autoresEnOferta;
    private double porDescuento;

    public LibreriaOferta(double pd, String [] aeo) {
        porDescuento = pd;
        autoresEnOferta = aeo;
    }

    public void setOferta(double pd, String [] aeo) {
        porDescuento = pd;
        autoresEnOferta = aeo;
    }

    public String [] getOferta() {
        return autoresEnOferta;
    }

    public double getDescuento() {
        return porDescuento;
    }

    @Override
    public void addLibro(String autor, String titulo, double pb) {
        boolean esAutorEnOferta = esAutorEnOferta(autor);
        Libro libro = null;
        if (esAutorEnOferta) {
            libro = new LibroEnOferta(autor, titulo, pb, porDescuento);
        } else {
            libro = new Libro(autor, titulo, pb);
        }
        addLibro(libro);
    }

    private boolean esAutorEnOferta(String autor) {
        int pos = 0;
        while (pos < autoresEnOferta.length && !autoresEnOferta[pos].equalsIgnoreCase(autor)) {
            pos++;
        }
        return pos < autoresEnOferta.length;
    }

    @Override
    public String toString() {
        return porDescuento + "%" + Arrays.toString(autoresEnOferta) +
                super.toString();
    }

}
