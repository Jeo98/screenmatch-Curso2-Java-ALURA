package com.aluracursos.screenmatch.modelosAplicacion;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()); //casteo explicito
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                '}';
    }
}
