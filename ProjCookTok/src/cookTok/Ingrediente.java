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
public class Ingrediente {
    private String nome_Ingred;
    private int cod_Ingred;
   
    public Ingrediente( ) { }
    
    public Ingrediente(String nome_Ingred) {
        this.cod_Ingred = -1;
        this.nome_Ingred = nome_Ingred;
    }
    
    public Ingrediente(int cod, String nome_Ingred) {
        this.cod_Ingred = cod;
        this.nome_Ingred = nome_Ingred;
    }
  
    public String getNome_Ingred() {
        return nome_Ingred;
    }
 
    public void setNome_Ingred(String nome_Ingred) {
        this.nome_Ingred = nome_Ingred;
    }
  
    public int getCod_Ingred() {
        return cod_Ingred;
    }
   
    public void setCod_Ingred(int cod_Ingred) {
        this.cod_Ingred = cod_Ingred;
    }
  
    @Override
    public String toString() {
        return "Ingrediente:{ \n nome_Ingred =  " +  nome_Ingred + "\n cod_Ingred =  " + cod_Ingred +  "}\n ";
    }
    
}
