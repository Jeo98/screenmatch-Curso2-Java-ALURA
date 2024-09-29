package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelosAplicacion.*;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Iron Man 3",2001,123,"Joel"); // creo una instancia del tipo com.aluracursos.screenmatch.modelosAplicacion.pelicula. peli1 tendrá los atributos de la clase com.aluracursos.screenmatch.modelosAplicacion.pelicula
        Pelicula otraPeli = new Pelicula("Matrix",2005,230,"Jimmmy");
        Pelicula PeliculaDeJuan = new Pelicula("Toy Story",1998,188,"Disney");
        Serie serie1= new Serie(1, 5,54,"Breaking Bad",1999,999);
        peli1.evalua(8);
        otraPeli.evalua(9);
        PeliculaDeJuan.evalua(4);
        serie1.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>(); // creo la lista de peliculas, tipo arraylist
        lista.add(PeliculaDeJuan);
        lista.add(peli1);
        lista.add(otraPeli);
        lista.add(serie1);

        for (Titulo item:lista){ //foreach, no sale como referencia de intellij, CONSULTAR

            System.out.println(item.getNombrePelicula());//llama la tostring de ese item siendo cada elemento cargado en la lista
            //Pelicula peliculanueva = (Pelicula) item;
            if(item instanceof Pelicula pelinueva) { // item es instancia de Pelicula? si => crea pelinueva
                System.out.println(pelinueva.getClasificacion());//realizo el casteo directo al metodo
            }
        }



    }
}
