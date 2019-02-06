package com.example.migue.tpnovo;

public class Pergunta {
    String pergunta;
    int numero;
    int tema;

    public Pergunta (String _pergunta, int _numero, int _tema){
        this.pergunta= _pergunta;
        this.numero= _numero;
        this.tema= _tema;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }
}
