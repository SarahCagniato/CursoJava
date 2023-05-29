
/*
Descrição: Algoritmo que gera 50 números inteiros e some eles numa variável. Depois
de somar todos, faça o mesmo com 50 números reais aleatórios. Após calcular tudo, mostre
as duas somas e aponte qual foi a maior.
Autora: Sarah 
Data: 29/05/23
*/

import java.util.Random;

public class SarahCagniato_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intNumbers = new int[50];
        double[] doubleNumbers = new double[50];
        int sumInt = 0;
        double sumDouble = 0.0;

        System.out.println("Números inteiros gerados:");
        for (int i = 0; i < intNumbers.length; i++) {
        // Gera um número inteiro aleatório entre 0 e 99
            intNumbers[i] = random.nextInt(100); 
            System.out.print(intNumbers[i] + " ");
            sumInt += intNumbers[i];
        }

        System.out.println("\nNúmeros reais gerados:");
        for (int i = 0; i < doubleNumbers.length; i++) {
        // Gera um número real aleatório entre 0 e 99.999...    
            doubleNumbers[i] = random.nextDouble() * 100; 
            System.out.print(doubleNumbers[i] + " ");
            sumDouble += doubleNumbers[i];
        }

        System.out.println("\n\nA soma dos 50 números inteiros aleatórios é: " + sumInt);
        System.out.println("A soma dos 50 números reais aleatórios é: " + sumDouble);

            //mostra na tela as respectivas frases

        if (sumInt > sumDouble) {
            System.out.println("\nA soma dos números inteiros é maior.");
        } else if (sumDouble > sumInt) {
            System.out.println("\nA soma dos números reais é maior.");
        } else {
            System.out.println("\nAs duas somas são iguais.");
        }
    }
}

