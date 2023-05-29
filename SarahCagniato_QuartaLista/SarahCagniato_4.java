
/*
Descrição: Crie um algoritmo que pega um texto inserido pelo usuário e verifique se a quantidade
de caracteres desse texto for maior que 10, mostre "você digitou um palavrão!", se não
mostre "você digitou uma palavrinha"
Autora: Sarah 
Data: 29/05/23
*/

import java.util.Scanner;

public class SarahCagniato_4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        try (Scanner input = new Scanner(System.in)) {
        // Lê uma linha de texto digitada pelo usuário e armazena na variável "texto"

            System.out.println("Digite um texto: ");
            String texto = input.nextLine();

        // Verifica se o texto possui mais de 10 caracteres
            if (texto.length() > 10) { 
        // Imprime uma mensagem indicando que o texto é um "palavrão"
                System.out.println("Você digitou um palavrão!"); 
            } else {
        // Imprime uma mensagem indicando que o texto é uma "palavrinha"        
                System.out.println("Você digitou uma palavrinha."); 
            }
        }
    }
}
