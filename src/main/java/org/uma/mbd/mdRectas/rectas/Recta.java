package org.uma.mbd.mdRectas.rectas;
import org.uma.mbd.mdRectas.rectas.Vector;
import org.uma.mbd.mdRectas.rectas.Punto;

public class Recta {
    private Vector director;
    private Punto pto;

    public Recta(Vector v, Punto p) {
        director = v;
        pto = p;
    }
    public Recta(Punto o, Punto e){
        director = new Vector (o,e);
        pto = o;
    }
    public boolean pasaPor(Punto){

    }
    public boolean paralelaA(Recta){

    }
    public Recta paralelaPor(Punto){

    }
    public Recta perpendicularPor(Punto){

    }
    public Punto intersecciónCon(Recta){

    }
    public double distanciaDesde(Punto){

    }

    @Override
    public String toString() {
        return "Recta{" +
                "director=" + director +
                ", pto=" + pto +
                '}';
    }
}

