package com.example.migue.tpnovo;

public class Resposta {
    int tema;
    String media;


    public Resposta(int _tema, String _media){
        this.tema=_tema;
        this.media=_media;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
