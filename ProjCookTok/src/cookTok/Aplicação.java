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
public class Aplicação {
    public static void main(String[] args) {
        Ingrediente ingre1 = new Ingrediente("Farinha de Trigo");
        Ingrediente ingre2 = new Ingrediente("Ovo");
        Ingrediente ingre3 = new Ingrediente("Leite");
        Ingrediente ingre4 = new Ingrediente("Manteiga");
        Ingrediente ingre5 = new Ingrediente("Chocolate");
       
        System.out.println(ingre1.toString());
        System.out.println(ingre2.toString());
        System.out.println(ingre3.toString());
        System.out.println(ingre4.toString());
        System.out.println(ingre5.toString()); 
        
        
    }
}
