/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacosmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Operacosmatematicas {

    public static void main(String[] args) {
        // Definição de dois números
        double num1 = 10.5;
        double num2 = 5.2;
        
        // Realizando operações matrmáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por zero.
        double resto = num1 % num2;
        
        //Exibindo os resultados
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao :
                "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
    }
}
