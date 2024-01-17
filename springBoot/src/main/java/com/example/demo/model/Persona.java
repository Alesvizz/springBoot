package com.example.demo.model;

public class Persona {
    private String nome;
    private String cognome;
    private String codFiscale;
    private int eta;
    
    public Persona(String nome, String cognome, String codFiscale, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = codFiscale;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    
}
