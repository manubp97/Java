package org.uma.mbd.mdUrna.urnas;

import java.util.Random;

public class Urna {
    private final Random alea = new Random();
    private int nBlancas, nNegras;

    public Urna(int nB, int nN) {
        nBlancas = nB;
        nNegras = nN;
    }

    public ColorBola extraerBola() {
        ColorBola bolaSacada = null;
        if (totalBolas() == 0) {
            throw new RuntimeException();
        }
        // Seguro que hay bolas
        int i = 1 + alea.nextInt(totalBolas());
        if (i <= nNegras) {
            bolaSacada = ColorBola.Negra;
            nNegras--;
        } else bolaSacada = ColorBola.Blanca;
        nBlancas--;
        return bolaSacada;
    }

    public int totalBolas() {
        return (nBlancas + nNegras);
    }

    public void ponerBlanca() {
        nBlancas++;
    }

    public void ponerNegra() {
        nNegras++;
    }

    public enum ColorBola {Blanca, Negra}
}
