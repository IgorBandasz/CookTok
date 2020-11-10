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
        Ingredientes ingre1 = new Ingredientes("Farinha de Trigo", 001);
        Ingredientes ingre2 = new Ingredientes("Ovo", 002);
        Ingredientes ingre3 = new Ingredientes("Leite", 003);
        Ingredientes ingre4 = new Ingredientes("Manteiga", 004);
        Ingredientes ingre5 = new Ingredientes("Chocolate", 005);
       
        System.out.println(ingre1.toString());
        System.out.println(ingre2.toString());
        System.out.println(ingre3.toString());
        System.out.println(ingre4.toString());
        System.out.println(ingre5.toString()); 
        
        
    }
}
