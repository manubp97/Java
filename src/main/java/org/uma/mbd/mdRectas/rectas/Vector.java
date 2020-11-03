package org.uma.mbd.mdRectas.rectas;

public class Vector {
    private final Punto extremo;

    public Vector(double a, double b) {
        extremo = new Punto(a, b);
    }

    public Vector(Punto pto) {
        extremo = pto;
    }

    public Vector(Punto pto1, Punto pto2) {
        extremo = new Punto(pto2.getX() - pto1.getX(), pto2.getY() - pto2.getY());
    }

    public double getComponenteX() {
        return extremo.getX();
    }

    public double getComponenteY() {
        return extremo.getY();
    }

    public double modulo() {
        return extremo.distancia(new Punto());
    }

    public Vector ortogonal() {
        return new Vector(-getComponenteY(), getComponenteX());
    }

    public boolean paraleloA(Vector Vec) {
        return getComponenteX() * Vec.getComponenteY() == getComponenteY() * Vec.getComponenteX();
    }

    public Punto extremoDesde(Punto org) {
        return new Punto(org.getX() + getComponenteX(), org.getY() + getComponenteY());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "extremo=" + extremo +
                '}';
    }
}
