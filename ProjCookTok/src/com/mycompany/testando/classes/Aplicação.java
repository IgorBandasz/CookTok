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
public class Aplicação {
    public static void main(String[] args) {
        Ingredientes ingre1 = new Ingredientes("Farinha de Trigo");
        Ingredientes ingre2 = new Ingredientes("Ovo");
        Ingredientes ingre3 = new Ingredientes("Leite");
        Ingredientes ingre4 = new Ingredientes("Manteiga");
        Ingredientes ingre5 = new Ingredientes("Chocolate");
       
        System.out.println(ingre1.toString());
        System.out.println(ingre2.toString());
        System.out.println(ingre3.toString());
        System.out.println(ingre4.toString());
        System.out.println(ingre5.toString()); 
        
        
    }
}
