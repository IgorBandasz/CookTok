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
public class Ingrediente_Receita extends Ingrediente{
    private Ingrediente ingrediente;
    private int quantidade_ingred;
    private Unidade_de_Medida unidade_de_medida;

    public Ingrediente_Receita(Ingrediente ingrediente, int quantidade_ingred, Unidade_de_Medida unidade_de_medida) {
        this.ingrediente = ingrediente;
        this.quantidade_ingred = quantidade_ingred;
        this.unidade_de_medida = unidade_de_medida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getQuantidade_ingred() {
        return quantidade_ingred;
    }

    public void setQuantidade_ingred(int quantidade_ingred) {
        this.quantidade_ingred = quantidade_ingred;
    }

    public Unidade_de_Medida getUnidade_de_medida() {
        return unidade_de_medida;
    }

    public void setUnidade_de_medida(Unidade_de_Medida unidade_de_medida) {
        this.unidade_de_medida = unidade_de_medida;
    }

    @Override
    public String toString() {
        return "Ingrediente_Receita{" + "ingrediente=" + ingrediente + ", quantidade_ingred=" + quantidade_ingred + ", unidade_de_medida=" + unidade_de_medida + '}';
    }

}
