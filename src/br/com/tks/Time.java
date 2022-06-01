package br.com.tks;

public class Time {
    private String nome;
    private String tecnico;
    private int pontos;


    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return this.tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getPontos() {
        return this.pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override // sobrescreve o método
    public String toString() {
        return this.nome + "-" + getPontos() + " ponto(s)";
    }

    public void pontuar() {
        this.pontos ++;
    }


}
