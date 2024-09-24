package com.aluracursos.screenmatch.modelosAplicacion;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numeroEpisodio;
    private String nombreEpisodio;
    private Serie serie;
    private int totalVisualizaciones;



    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNombreEpisodio() {
        return nombreEpisodio;
    }

    public void setNombreEpisodio(String nombreEpisodio) {
        this.nombreEpisodio = nombreEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    @Override
    public int getClasificacion() {
        if(this.totalVisualizaciones > 100)
            return 4 ;
        else
            return 2;
    }
}
