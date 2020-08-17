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
public class CuriosidadeInt {
    public static void main(String[] args) {
        
        int var1 = 2147483647;
        int var2 = 100;
        
        //-2147483648, quando pega o limit do número int ele vai voltar para o número negativo.
        
        System.out.println(var1 + var2);
    }    
}
