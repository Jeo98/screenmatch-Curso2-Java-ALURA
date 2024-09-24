package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelosAplicacion.Titulo;

public class CalculadoraDeTiempo {

    private int tiempototal=0;

    public void incluye(Titulo peli){

        this.tiempototal += peli.getDuracionEnMinutos();
    }

    public int getTiempototal() {
        return tiempototal;
    }


}
