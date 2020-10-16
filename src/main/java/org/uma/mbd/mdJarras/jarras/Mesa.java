package org.uma.mbd.mdJarras.jarras;

public class Mesa {
    private final Jarra jarraA;
    private final Jarra jarraB;

    public Mesa(Jarra capA, Jarra capB) {
        jarraA = capA;
        jarraB = capB;
    }

    public void llenaA() {
        jarraA.llena();
    }

    public void llenaB() {
        jarraB.llena();
    }

    public void vaciaA() {
        jarraA.vacia();
    }

    public void vaciaB() {
        jarraB.vacia();
    }

    public void vuelcaAsobreB() {
        jarraB.llenaDesde(jarraA);
    }

    public void vuelcaBsobreA() {
        jarraA.llenaDesde(jarraB);
    }

    public int getCapacidadA() {
        return jarraA.getCapacidad();
    }

    public int getCapacidadB() {
        return jarraB.getCapacidad();
    }

    public int getContenidoA() {
        return jarraA.getContenido();
    }

    public int getContenidoB() {
        return jarraB.getContenido();
    }

    public String toString() {
        return jarraA.toString() + "\n" + jarraB.toString();
    }
}
