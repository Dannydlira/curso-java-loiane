/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
//        System.out.println("Digite seu nome completo: ");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//        
//        System.out.println("Digite seu primeiro nome: ");     
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//        
//        System.out.println("Digite sua idade: ");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: " + idade);
//        
//        System.out.println("Digite sua altura: ");
//        double altura = scan.nextDouble();
//        System.out.println("Sua altura é: " + altura);
        
        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e sem tem pet: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.hasNextDouble();
        
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantos filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem pet? " + temPet);
    }    
}
