package com.aluracursos.screenmatch.modelosAplicacion;

public record Tituloomdb(String title, String year, String runtime, String genre) {

    /*record es muy similar a una clase, pero no es lo mismo, en los parentesis van los atributos que vemos
    en la respuesta de la API, que viene en formato json. year y runtime los ponemos como string ya que asi es como
    se nos devuelve en la respuesta del servidor y por la respuesta en json.

    record ya crea los getters, setters automaticamente y un toString especial. no hace falta realizarlos

    NO OLVIDAR DE COLOCAR EXACTAMENTE EL MISMO NOMBRE QUE UTILIZA EL JSON DENTRO DE LOS PARAMETROS DE RECORD, SINO
    LOS VALORES RETORNADOS SERÁN NULL --> PERO EN VERDAD LO QUE SE DEBE HACER ES UTILIZAR METODO:

    new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); esto le dice al json que
    utilice otra politica para las mayusculas y minusculas

     */
}
