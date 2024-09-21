public class pelicula {
    //defino los atributos que pertenecen a una pelicula
    String nombre;
    int fechadelanzamiento, duracionEnMinutos;
    boolean includiaEnPlan;
    double sumaEvaluaciones=0.0;
    int cantidadEvaluaciones=0;

    void muestrafichatecnica(){

        System.out.println("Pelicula : " + this.nombre);
        System.out.println("Duracion : " + this.duracionEnMinutos);
        System.out.println("Fecha de lanzamiento : " + this.fechadelanzamiento);

    }

    void evalua(double nota ){
        cantidadEvaluaciones ++;
        sumaEvaluaciones += nota; // acumula cada calificacion que da cada usuario

    }

    double calculaMedia(){

            return (this.sumaEvaluaciones/this.cantidadEvaluaciones);
    }

}
