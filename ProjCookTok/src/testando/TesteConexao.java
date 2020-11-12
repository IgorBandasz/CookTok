/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testando;

import cookTok.Ingrediente;
import db.TbIngrediente;

public class TesteConexao {
    public static void main(String[] args) {
        TbIngrediente ingrediente = new TbIngrediente();
        Ingrediente arroz = new Ingrediente("arroz");
        arroz.setCod_Ingred(5);
        ingrediente.update(arroz,"batata");
    }
}
