package com.aluracursos.screenmatch.exception;

public class ErrorEnConversionException extends RuntimeException {

        private String mensaje;

    public ErrorEnConversionException(String mensaje) {

        this.mensaje=mensaje;


    }

    public String getMessage(){

        return this.mensaje;

    }







}
