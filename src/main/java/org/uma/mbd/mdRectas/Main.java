package org.uma.mbd.mdRectas;

import org.uma.mbd.mdRectas.rectas.Punto;
import org.uma.mbd.mdRectas.rectas.Recta;

public class Main {
    public static void main(String[] args) {
        //Calcular el área del triángulo formado por tres puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(2, 3);
// Se calcula la distancia entre p1 y p2
        double base = p1.distancia(p2);
// Se calcula la recta que pasa por p1 y p2
        Recta r1 = new Recta(p1, p2);
// se calcula la distancia entre p3 y r1
        double altura = r1.distanciaDesde(p3);
// El area es base*altura/2
        double area = base * altura / 2;
        System.out.printf("Puntos %s %s %s\n", p1, p2, p3);
        System.out.println("Area = " + area);
// La perpendicular a r1 por p3
        Recta r2 = r1.perpendicularPor(p3);
        System.out.println("La perpendicular a " + r1 + " por " + p3 + " es: " + r2);
// La interseccion de r2 con la recta paralela a r1 y que pasa por p3
        System.out.println(r2.interseccionCon(r1.paralelaPor(p3)));
    }
}