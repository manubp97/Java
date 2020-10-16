package org.uma.mbd.mdJarras;

import org.uma.mbd.mdJarras.jarras.Jarra;
import org.uma.mbd.mdJarras.jarras.Mesa;

public class Main {
    public static void main(String[] args) {
        Jarra jarA = new Jarra(5);
        Jarra jarB = new Jarra(7);
        jarA.llena();
        jarB.llenaDesde(jarA);
        jarA.llena();
        jarB.llenaDesde(jarA);
        jarB.vacia();
        jarB.llenaDesde(jarA);
        jarA.llena();
        jarB.llenaDesde(jarA);
        jarB.vacia();
        System.out.println(jarA.toString());

        Mesa mesaA = new Mesa(jarA, jarB);
        mesaA.llenaA();
        mesaA.vuelcaAsobreB();
        mesaA.llenaA();
        mesaA.vuelcaAsobreB();
        mesaA.vaciaB();
        mesaA.vuelcaAsobreB();
        mesaA.llenaA();
        mesaA.vuelcaAsobreB();
        mesaA.vaciaB();
        System.out.println(mesaA.toString());
    }
}
