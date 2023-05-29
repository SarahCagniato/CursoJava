
/*
Descrição: Faça um software que some 10 valores inteiros positivos (ignore valores negativos, caso
o usuário os insira) e mostre sua raiz quadrada.
Autora: Sarah 
Data: 29/05/23
*/

import java.util.Scanner;

public class SarahCagniato_6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        try (Scanner input = new Scanner(System.in)) { 
        // Variável para armazenar a soma dos valores    
            int sum = 0; 
        // Variável para contar quantos valores inteiros positivos foram inseridos    
            int count = 0; 

            System.out.println("Digite 10 valores inteiros positivos:");

        // Executa o loop enquanto o contador for menor que 10    
            while (count < 10) { 
        // Lê um valor inteiro digitado pelo usuário e armazena na variável "value"    
                int value = input.nextInt(); 

        // Verifica se o valor é positivo    
                if (value > 0) { 
        // Adiciona o valor à soma    
                    sum += value; 
        // Incrementa o contador de valores positivos    
                    count++;
                } else {
        // Exibe uma mensagem indicando que o valor negativo foi ignorado    
                    System.out.println("Valor negativo ignorado."); 
                }
            }

            double squareRoot = Math.sqrt(sum); // Calcula a raiz quadrada da soma dos valores

            System.out.println("A soma dos valores é: " + sum); // Exibe a soma dos valores
            System.out.println("A raiz quadrada da soma é: " + squareRoot); // Exibe a raiz quadrada da soma dos valores
        }
    }
}
