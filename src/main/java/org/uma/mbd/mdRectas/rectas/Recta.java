package org.uma.mbd.mdRectas.rectas;

public class Recta {
    private final Vector director;
    private final Punto pto;

    public Recta(Vector v, Punto p) {
        director = v;
        pto = p;
    }

    public Recta(Punto o, Punto e) {
        director = new Vector(o, e);
        pto = o;
    }

    public boolean pasaPor(Punto p) {
        Vector v = new Vector(p, pto);
        return v.paraleloA(director);
    }

    public boolean paralelaA(Recta r) {
        return director.paraleloA(r.director);
    }

    public Recta paralelaPor(Punto p) {
        return new Recta(director, p);
    }

    public Recta perpendicularPor(Punto p) {
        return new Recta(director.ortogonal(), p);
    }

    public Punto interseccionCon(Recta r) {
        if (paralelaA(r)) {
            throw new RuntimeException("Rectas paralelas");
        }
        // Las rectas no son paralelas
        double d = director.getComponenteX() * r.director.getComponenteY() - r.director.getComponenteX() * director.getComponenteY();
        double d1 = director.getComponenteX() * pto.getY() - director.getComponenteY() * pto.getX();
        double d2 = r.director.getComponenteX() * r.pto.getY() - r.director.getComponenteY() * r.pto.getX();
        double ox = (d1 * r.director.getComponenteX() - d2 * director.getComponenteX()) / d;
        double oy = (d1 * r.director.getComponenteY() - d2 * director.getComponenteY()) / d;
        return new Punto(ox, oy);
    }

    public double distanciaDesde(Punto p) {
        Recta per = perpendicularPor(p);
        Punto inter = interseccionCon(per);
        return inter.distancia(p);
    }

    @Override
    public String toString() {
        return "R{" + director + pto + '}';
    }
}

