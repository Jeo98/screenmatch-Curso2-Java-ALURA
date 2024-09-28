import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelosAplicacion.*;

import java.util.ArrayList;

public class principal {

    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula(); // creo una instancia del tipo com.aluracursos.screenmatch.modelosAplicacion.pelicula. peli1 tendrá los atributos de la clase com.aluracursos.screenmatch.modelosAplicacion.pelicula
        peli1.setNombre("Iron Man 3");
        peli1.setFechadelanzamiento(2001);
        peli1.setIncludiaEnPlan(true);
        peli1.setDuracionEnMinutos(200);


        ///  peli1.duracionEnMinutos = 120;
        //peli1.fechadelanzamiento = 2000;
       // peli1.includiaEnPlan = true;

        /*System.out.println("Pelicula : " + peli1.nombre);
        System.out.println("Duracion : " + peli1.duracionEnMinutos);
        System.out.println("Fecha de lanzamiento : " + peli1.fechadelanzamiento);
        */
        peli1.muestrafichatecnica();
        peli1.evalua(7.8);
        peli1.evalua(6);
        peli1.evalua(10);
        System.out.println(peli1.getSumaEvaluaciones());
        System.out.println(peli1.calculaMedia());

        Serie serie1= new Serie();
        serie1.setNombre("Breaking Bad");
        serie1.setFechadelanzamiento(2005);
        serie1.setTemporada(1);
        serie1.setMinutosporEpisodio(45);
        serie1.setEpisodiosPortemportada(7);
        serie1.setIncludiaEnPlan(true);
        serie1.muestrafichatecnica();
        System.out.println(serie1.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(peli1);
        Pelicula otraPeli = new Pelicula();
        otraPeli.setNombre("Matrix");
        otraPeli.setFechadelanzamiento(1998);
        otraPeli.setDuracionEnMinutos(180);

        calculadora.incluye(otraPeli);

        System.out.println(calculadora.getTiempototal());

        Pelicula PeliculaDeJuan = new Pelicula();
        PeliculaDeJuan.setNombre("Toy Story");
        PeliculaDeJuan.setFechadelanzamiento(1998);
        PeliculaDeJuan.setDuracionEnMinutos(180);

        ArrayList<Pelicula> ListaDePeliculas = new ArrayList<>(); // creo la lista de peliculas, tipo arraylist
        ListaDePeliculas.add(PeliculaDeJuan);
        ListaDePeliculas.add(peli1);
        ListaDePeliculas.add(otraPeli);

        System.out.println(ListaDePeliculas.size());
        System.out.println(ListaDePeliculas.get(0).getNombrePelicula());
        System.out.println(ListaDePeliculas.get(1));

        System.out.println(ListaDePeliculas);
        System.out.println(ListaDePeliculas.get(0));


    }
}
