package com.aluracursos.screenmatch.principal;
import com.aluracursos.screenmatch.exception.ErrorEnConversionException;
import com.aluracursos.screenmatch.modelosAplicacion.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula: ");
        var  nombre=  lectura.nextLine();
        String direccion= ("http://www.omdbapi.com/?t="+nombre.replace(" ","+")+"&apikey=8eb50e5");

        try{
        //debo realizar una peticion a servidor
        HttpClient client = HttpClient.newHttpClient();
        //arquitectura Cliente-Servidor, nosotros somos el cliente que pide info al server

        HttpRequest request = HttpRequest.newBuilder()
                //builder es un patron de diseño
                //request es Qué es lo que vamos a pedir al sever
                .uri(URI.create(direccion))
                .build();
        /*El patron builder sirve para construir algo que puede tener muchas formas
        ejemplo de una casa en la que cliente dice como quiere que sea, cantidad de cuartos, etc

          Un Identificador Uniforme de Recursos (URI) es una cadena de caracteres utilizada para
          identificar o nombrar un recurso en Internet.  El URI identifica un recurso y
          lo diferencia de otros mediante un nombre, una ubicación o ambos.

        Otro punto importante es que no se puede instanciar directamente un tipo httpRequest, ya que es abstracto
        trabaja como si fuese una interfaz, por ello es que vemos la estructura "Builder" en la cual si se puede
        crear la instancia de HttpRequest.

        ( https://docs.oracle.com/en/java/javase/23/docs/api/java.net.http/java/net/http/HttpRequest.html )
        ESTO ES LO QUE VAMOS A PEDIR, ahora debemos realizar la parte de respuesta

        ------------------------------------------------------------------------------------------------------
         (https://docs.oracle.com/en/java/javase/23/docs/api/java.net.http/java/net/http/HttpResponse.html)


         */
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //el .send() pide crear una excepcion ya que al estar vinculado con internet existe el caso
        //en que caiga conexión o algo ocurra, por ello pide el manejo de excepcion (throws IOException, InterruptedException)
        String json=response.body();
        System.out.println(json); //printeo el body de lo que obtengo de respuesta
        Gson gson =new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); // para no tener problema entre mayusculas y minusculas
        Tituloomdb miTituloomdb= gson.fromJson(json, Tituloomdb.class);
        System.out.println(miTituloomdb);

        Titulo miTitulo = new Titulo(miTituloomdb);

            FileWriter escritura = new FileWriter("Peliculas.txt"); //creo el archivo donde voy a escribir
            escritura.write(miTitulo.toString()); //convierto a string ya que es el parametro esperado por write
            //NO OLVIDAR CERRAR CONEXION
            escritura.close(); //cerramos comunicacion para terminar de escribir archivo



        //try catch se utiliza para evitar que el programa se rompa en totalidad. Se rompe dentro de bloque try y muere ahi, no pasa a mayores.

            System.out.println(miTitulo);
        }catch (ErrorEnConversionException e){
            System.out.println(e.getMessage());

        }

        System.out.println("Fin de programa D: ");



    }//Fin Main

}//FIN CLASS
