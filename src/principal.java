public class principal {

    public static void main(String[] args) {

        pelicula peli1 = new pelicula(); // creo una instancia del tipo pelicula. peli1 tendrá los atributos de la clase pelicula
        peli1.nombre= "Sherk";
        peli1.duracionEnMinutos = 120;
        peli1.fechadelanzamiento = 2000;
        peli1.includiaEnPlan = true;

        /*System.out.println("Pelicula : " + peli1.nombre);
        System.out.println("Duracion : " + peli1.duracionEnMinutos);
        System.out.println("Fecha de lanzamiento : " + peli1.fechadelanzamiento);
        */
        peli1.muestrafichatecnica();
        peli1.evalua(7.8);
        peli1.evalua(6);
        peli1.evalua(10);
        System.out.println(peli1.sumaEvaluaciones);
        System.out.println(peli1.calculaMedia());

    }
}
