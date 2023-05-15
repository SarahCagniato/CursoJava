/*
    DESCRIÇÃO: Algoritmo que receba um número e mostre se ele é par ou ímpar.
    Autora: SArah Cagniato
    08/05/2023
*/


import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Variável
            int num;

            // Entrada de dados
            System.out.print("Informe um número inteiro: ");
            num = input.nextInt();

            // Verificação se é par ou ímpar
            if (num % 2 == 0) {
                System.out.println("O número informado é par.");
            } else {
                System.out.println("O número informado é ímpar.");
            }
        }
    }
}