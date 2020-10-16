package org.uma.mbd.mdUrna;

import org.uma.mbd.mdUrna.urnas.Urna;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        int nBl = Integer.parseInt(args[0]);
        int nNg = Integer.parseInt(args[1]);
        Urna u = new Urna(nBl, nNg);
        while (u.totalBolas() > 1) {
            Urna.ColorBola b1 = u.extraerBola();
            Urna.ColorBola b2 = u.extraerBola();
            if (b1 == b2) {
                u.ponerBlanca();
            } else {
                u.poner.negra();
            }

        }
    }
}
