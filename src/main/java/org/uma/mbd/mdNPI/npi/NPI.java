package org.uma.mbd.mdNPI.npi;

public class NPI {
    private double x;
    private double y;
    private double z;
    private double t;

    public void entra(double valor){
            t = z; z = y; y = x; x = valor;
    }
    public void suma(){
        x += y; y = z; z = t; t = 0;
    }
    public void resta(){
        x = y - x; y = z; z = t; t = 0;
    }
    public void multiplica(){
        x *= y; y = z; z = t; t = 0;
    }
    public void divide(){
        x = y / x; y = z; z = t; t = 0;
    }
    public double getResultado(){
        return x;
    }
}
