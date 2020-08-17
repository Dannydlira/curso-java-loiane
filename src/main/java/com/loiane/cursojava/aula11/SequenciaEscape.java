/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula11;

/**
 *
 * @author resource
 */
public class SequenciaEscape {
    public static void main(String[] args) {
        
        //"Hello, World!", para imprimir essas aspas tem que usar a barra invertida \.
        
        System.out.println("\"Hello, World!\"");
        
        // 1\4, tem que colocar duas barras invertidas para poder printar na tela.
        System.out.println("1\\4");
    }    
}
