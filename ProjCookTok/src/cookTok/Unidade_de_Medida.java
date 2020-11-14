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
public enum Unidade_de_Medida {
KG(1), G(2), L(3), ML(4);
//São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos.

private final int valor;
Unidade_de_Medida(int valorOpcao){
valor = valorOpcao;
} //Para iniciar os valores declarados dentro das variáveis Enum, é preciso declarar um construtor para iniciar os seus atributos que são declarados.
public int getValor(){
return valor;
}
}

