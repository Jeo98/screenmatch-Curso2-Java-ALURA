package com.aluracursos.screenmatch.modelosAplicacion;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title") //cada vez que se lea en el json "Title" va a remplazar por nombre.(serializa el nombre)
    //defino los atributos que pertenecen a una com.aluracursos.screenmatch.modelosAplicacion.pelicula
    private String nombre;
    @SerializedName("Year")
    private int fechadelanzamiento;
    private int duracionEnMinutos;
    private boolean includiaEnPlan;
    private double sumaEvaluaciones=0.0;
    private int cantidadEvaluaciones=0; //total de evaluaciones

    public Titulo(String nombre, int fechadelanzamiento, int duracionEnMinutos) {//CONSTRUCTOR
        this.nombre = nombre;
        this.fechadelanzamiento = fechadelanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
    }


    public Titulo(Tituloomdb miTituloomdb) {
        this.nombre = miTituloomdb.title();
        this.fechadelanzamiento = Integer.valueOf(miTituloomdb.year()); //aplico casteo
        this.duracionEnMinutos = Integer.valueOf(miTituloomdb.runtime().substring(0,2));
        //substring se utiliza para que solamente tome los valores en los casilleros posicion 0 a 2.

    }

    public Titulo() {

    }


    public void muestrafichatecnica(){

        System.out.println("Pelicula : " + this.getNombrePelicula());
        System.out.println("Duracion : " + this.getDuracionEnMinutos());
        System.out.println("Fecha de lanzamiento : " + this.getFechadelanzamiento());

    }

    public void evalua(double nota ){
        cantidadEvaluaciones ++;
        sumaEvaluaciones += nota; // acumula cada calificacion que da cada usuario

    }
    public int getDuracionEnMinutos(){

        return this.duracionEnMinutos;
    }
    public double calculaMedia(){

        return (this.sumaEvaluaciones/this.cantidadEvaluaciones);
    }

    public double getSumaEvaluaciones(){

        return this.sumaEvaluaciones;
    }
    public int getCantidadEvaluaciones(){

        return this.cantidadEvaluaciones;

    }

    public String getNombrePelicula(){

        return this.nombre;
    }


    public void setNombre(String nombre){

        this.nombre=nombre;
    }
    public  void setFechadelanzamiento(int fecha){

        this.fechadelanzamiento=fecha;

    }

    public  void setDuracionEnMinutos(int duracionEnMinutos){

        this.duracionEnMinutos=duracionEnMinutos;
    }

    public  void setIncludiaEnPlan(boolean estado){

        this.includiaEnPlan=estado;
    }



    public int getFechadelanzamiento(){

        return this.fechadelanzamiento;
    }


    public String getincluidoEnPlan(){

        if(this.includiaEnPlan)
            return "Dentro de plan";
        else
            return "Fuera de plan";

    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", fechadelanzamiento=" + fechadelanzamiento + ", duracion: "+ duracionEnMinutos;
    }

    @Override
    public int compareTo(Titulo otroTitulo) { //utilizo el metodo para comparar titulos


        return this.getNombrePelicula().compareTo(otroTitulo.getNombrePelicula());
        //retorna negativo si this es menor que otro titulo, 0 si son iguales y 1 si this es mayor a otroTitulo
    }
}
