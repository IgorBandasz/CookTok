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
public class Rel_ReceitaIngrediente {
    private int cod_Relacao;
    private int cod_Receita;
    private int cod_Ingred;
    private int quantidade;
    private String unidade;
    
    public Rel_ReceitaIngrediente( ) {
       
    }
    
    public Rel_ReceitaIngrediente(int cod_Receita, int cod_Ingred, int quantidade, String unidade) {
        this.cod_Receita = cod_Receita;
        this.cod_Ingred = cod_Ingred;
        this.quantidade = quantidade;
        this.unidade =  unidade;
    }
    
    public Rel_ReceitaIngrediente(int cod_Relacao, int cod_Receita, int cod_Ingred, int quantidade, String unidade) {
        this.cod_Relacao = cod_Relacao;
        this.cod_Receita = cod_Receita;
        this.cod_Ingred = cod_Ingred;
        this.quantidade = quantidade;
        this.unidade =  unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getCod_Relacao() {
        return cod_Relacao;
    }
    

    public void setCod_Relacao(int cod_Relacao) {
        this.cod_Relacao = cod_Relacao;
    }

    public int getCod_Receita() {
        return cod_Receita;
    }

    public void setCod_Receita(int cod_Receita) {
        this.cod_Receita = cod_Receita;
    }

    public int getCod_Ingred() {
        return cod_Ingred;
    }

    public void setCod_Ingred(int cod_Ingred) {
        this.cod_Ingred = cod_Ingred;
    }

    @Override
    public String toString() {
        return "Rel_ReceitaIngrediente{" + "cod_Relacao=" + cod_Relacao + ", cod_Receita=" + cod_Receita + ", cod_Ingred=" + cod_Ingred + ", quantidade=" + quantidade + ", unidade=" + unidade + '}';
    }


}
