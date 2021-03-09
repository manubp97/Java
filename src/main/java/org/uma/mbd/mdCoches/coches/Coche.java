package org.uma.mbd.mdCoches.coches;

public class Coche {
    static double PIVA=0.16;
    private String nombre;
    private double precio;

    public Coche(String nombre, double precio) {
        this.nombre=nombre;
        this.precio=precio;
    }
    public static void setPiva(double PIVA){
        Coche.PIVA = PIVA;
    }
    public double precioTotal(){
        return precio*(1+PIVA);
    }
    public String toString(){
        return nombre+" -> "+precioTotal();
    }
}
