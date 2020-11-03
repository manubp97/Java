package org.uma.mbd.mdRelojArena;

import org.uma.mbd.mdRelojArena.reloj.RelojArena;

public class Main{
    public static void main(String[] args) {
        RelojArena r1 = new RelojArena (7);
        RelojArena r2 = new RelojArena (5);
        r1.gira();
        System.out.println(r1.toString());
        r2.gira();
        System.out.println(r2.toString());
        r1.pasatiempo(r2);
        r2.gira();
        r2.pasatiempo(r1);
        r2.gira();
        r2.pasatiempo(r1);
    }
        }
