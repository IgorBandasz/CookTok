/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookTok;

/**
 *
 * @author ester
 */
public class Receita {
    private int cod_Receita;
    private String nome_Receita;
    private int tempo_Preparo;
    
    public Receita(){
        
    }
    
    public Receita(String nome_Receita, int tempo_Preparo) {
        this.nome_Receita = nome_Receita;
        this.tempo_Preparo = tempo_Preparo;
    }
    public Receita(int cod_Receita, String nome_Receita, int tempo_Preparo) {
        this.cod_Receita = cod_Receita;
        this.nome_Receita = nome_Receita;
        this.tempo_Preparo = tempo_Preparo;
    }
    public int getCod_Receita() {
        return cod_Receita;
    }
    public void setCod_Receita(int cod_Receita) {
        this.cod_Receita = cod_Receita;
    }
    public String getNome_Receita() {
        return nome_Receita;
    }
    public void setNome_Receita(String nome_Receita) {
        this.nome_Receita = nome_Receita;
    }
    public int getTempo_Preparo() {
        return tempo_Preparo;
    }
    public void setTempo_Preparo(int tempo_Preparo) {
        this.tempo_Preparo = tempo_Preparo;
    }
    @Override
    public String toString() {
        return "Receita{" + "cod_Receita=" + cod_Receita + ", nome_Receita=" + nome_Receita + ", tempo_Preparo=" + tempo_Preparo + '}';
    }
}
