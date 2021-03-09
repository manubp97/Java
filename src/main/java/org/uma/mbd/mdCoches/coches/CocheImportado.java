package org.uma.mbd.mdCoches.coches;
import org.uma.mbd.mdCoches.coches.Coche;
public class CocheImportado extends Coche{
    private double homologacion;
    public CocheImportado(String nombre, double precio, double homologacion){
        super(nombre, precio);
        this.homologacion=homologacion;
    }
    @Override
    public double precioTotal(){
        return super.precioTotal()+homologacion;
    }
}
