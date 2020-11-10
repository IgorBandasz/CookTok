/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testando.classes;

/**
 *
 * @author ester
 */
public class Instrucao {
    private String nome_Instru;
    private int cod_Instru;
    private int cod_Receita;
    private int tempo_Instru;
    public Instrucao(String nome_Instru, int cod_Instru, int cod_Receita, int tempo_Instru) {
        this.nome_Instru = nome_Instru;
        this.cod_Instru = cod_Instru;
        this.cod_Receita = cod_Receita;
        this.tempo_Instru = tempo_Instru;
    }

    public String getNome_Instru() {
        return nome_Instru;
    }

    public void setNome_Instru(String nome_Instru) {
        this.nome_Instru = nome_Instru;
    }

    public int getCod_Instru() {
        return cod_Instru;
    }

    public void setCod_Instru(int cod_Instru) {
        this.cod_Instru = cod_Instru;
    }

    public int getCod_Receita() {
        return cod_Receita;
    }

    public void setCod_Receita(int cod_Receita) {
        this.cod_Receita = cod_Receita;
    }

    public int getTempo_Instru() {
        return tempo_Instru;
    }

    public void setTempo_Instru(int tempo_Instru) {
        this.tempo_Instru = tempo_Instru;
    }

    @Override
    public String toString() {
        return "Instrucao{" + "nome_Instru=" + nome_Instru + ", cod_Instru=" + cod_Instru + ", cod_Receita=" + cod_Receita + ", tempo_Instru=" + tempo_Instru + '}';
    }
}
