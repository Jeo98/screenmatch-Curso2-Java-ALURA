package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelosAplicacion.*;
import com.google.gson.Gson;

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
        String direccion= ("http://www.omdbapi.com/?t="+nombre+"&apikey=8eb50e5");

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
        Gson gson = new Gson();
        Titulo miTitulo= gson.fromJson(json, Titulo.class);
        System.out.println(miTitulo);
    }//Fin Main

}//FIN CLASS
