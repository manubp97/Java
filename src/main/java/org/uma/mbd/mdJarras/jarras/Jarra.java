package org.uma.mbd.mdJarras.jarras;

public class Jarra {
    private int cap, con;
    public Jarra(int a) {
        cap = a;
        con = 0;
    }
    public void llena() {
        con = cap;
    }
    public void vacia(){
        con = 0;
    }
    public void llenaDesde(Jarra jar){
        int total = con + jar.con;
        if (total > cap) {
            con = cap;
            jar.con = total - con;
        } else {
            con = jar.con;
            jar.con = 0;
        }
    }
    public int getCapacidad(){
        return cap;
    }
    public int getContenido(){
        return con;
    }

    @Override
    public String toString(){
        return "Capacidad = " + cap + " Contenido = " + con;
    }
}
