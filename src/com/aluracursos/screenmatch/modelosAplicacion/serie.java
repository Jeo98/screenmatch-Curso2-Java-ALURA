package com.aluracursos.screenmatch.modelosAplicacion;

public class serie extends titulo{

    private  int temporada;
    private int episodiosPortemportada;
    private int minutosporEpisodio;


   public int getDuracionEnMinutos(){

       return temporada * episodiosPortemportada * minutosporEpisodio;
   }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPortemportada() {
        return episodiosPortemportada;
    }

    public void setEpisodiosPortemportada(int episodiosPortemportada) {
        this.episodiosPortemportada = episodiosPortemportada;
    }

    public int getMinutosporEpisodio() {
        return minutosporEpisodio;
    }

    public void setMinutosporEpisodio(int minutosporEpisodio) {
        this.minutosporEpisodio = minutosporEpisodio;
    }
}
