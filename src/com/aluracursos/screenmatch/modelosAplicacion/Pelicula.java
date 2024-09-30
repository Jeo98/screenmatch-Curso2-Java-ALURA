package com.aluracursos.screenmatch.modelosAplicacion;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;


    public Pelicula(String nombre, int fechadelanzamiento, int duracionEnMinutos, String director) {//CONSTRUCTOR
        super(nombre, fechadelanzamiento, duracionEnMinutos);
        this.director = director;
    }

    public Pelicula() {
        super();
    }


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
        return "Nombre: " + super.getNombrePelicula() + ", lanzamiento: " + super.getFechadelanzamiento();
    }
}
