package org.uma.mbd.mdRelojArena.reloj;

public class RelojArena {
    private int superior, inferior;
    public RelojArena(int a){
        inferior = a;
        superior = 0;
    }
public void gira(){
        int sup = superior;
        superior = inferior;
        inferior = sup;
}
public void pasatiempo(){
        inferior += superior;
        superior = 0;
}
public int getTiempoRestante(){
        return superior;
}
public void pasatiempo(RelojArena reloj){
        superior -= reloj.superior;
        inferior += reloj.superior;
        reloj.inferior += reloj.superior;
        reloj.superior = 0;
        if (superior < 0){
            superior = 0;
        }
}

    @Override
    public String toString() {
        return "R(" + superior + "/" + inferior + ")";
    }
}
