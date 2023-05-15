/* 
    DESCRIÇÃO: Tema Livre (jogo dedivinhação)
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Random;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        // Gerar número aleatório entre 1 e 100
        int numeroSecreto = gerador.nextInt(100) + 1;

        // Variáveis do tipo texto e caractere
        String nome;
        char resposta;

        // Variáveis do tipo inteiro e real
        int tentativas = 0;
        int palpite;
        double pontuacao = 0;

        // Solicitar nome do jogador
        System.out.print("Olá! Qual é o seu nome? ");
        nome = entrada.nextLine();
        System.out.println("Bem-vindo(a) " + nome + "!");
        System.out.println("Vamos jogar um jogo de adivinhação...");

        do {
            // Solicitar palpite do usuário
            System.out.print("Digite um número entre 1 e 100: ");
            palpite = entrada.nextInt();
            entrada.nextLine(); // Limpar o buffer do scanner

            // Incrementar número de tentativas
            tentativas++;

            // Verificar se o palpite é igual, maior ou menor que o número secreto
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns, você acertou!");
                if (tentativas == 1) {
                    pontuacao = 100;
                } else if (tentativas <= 5) {
                    pontuacao = 50;
                } else if (tentativas <= 10) {
                    pontuacao = 25;
                } else {
                    pontuacao = 10;
                }
                System.out.printf("Sua pontuação foi %.2f.\n", pontuacao);
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else {
                System.out.println("O número secreto é menor!");
            }

        } while (palpite != numeroSecreto);

        // Perguntar se o usuário deseja jogar novamente
        System.out.print("Deseja jogar novamente?");
        resposta = entrada.next().charAt(0);

        // Verificar resposta do usuário
        if (resposta == 'S' || resposta == 's') {
            System.out.println("OK, vamos jogar novamente!");
            main(args);
        } else {
            System.out.println("Obrigado por jogar! Até a próxima.");
        }

        entrada.close();
    }
}

