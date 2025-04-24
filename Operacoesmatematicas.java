/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Operacoesmatematicas {
// Projeto de Gabriel Conceição Ortega Faia.
    public static void main(String[] args) {
         // Definição de dois números
        double num1 = 10.5;
        double num2 = 5.2;
        
        double base = 6;
        double altura = 8;
         double diagonalmenor = 6;
         double diagonalmaior = 8;
         double lado = 6;
         double raio = 6;
        // Realizando operações matrmáticas com áreas.
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por zero.
        double resto = num1 % num2;
        double areatriangulo = (base * altura) / 2;
        double arearetangulo = base * altura;
        double arealosango = (diagonalmenor * diagonalmaior) / 2;
        double areaquadrado = lado * lado;
        double areacircunferencia = 3.14 * (raio * raio);// 3.14 é o número de pi.
        double media = (num1 + num2) / 2; //O número que irá dividir tem que ser o mesmo número do total de variáveis.
        
        
        //Exibindo os resultados
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao :
                "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Área do Triângulo: " + areatriangulo);
        System.out.println("Área do Retângulo:" + arearetangulo);
        System.out.println("Área do Losango:" + arealosango);
        System.out.println("Área do Quadrado:" + areaquadrado);
        System.out.println("Área da Circunferência:" + areacircunferencia);
        System.out.println("Média:" + media);
        
        
    }
}

