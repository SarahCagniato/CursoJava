/* 
    DESCRIÇÃO: Tema Livre (decisão encadeada para exibir uma mensagem personalizada de acordo com a idade informada)
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Variáveis
            int idade;
            double altura;
            String nome;
            char genero;

            // Entrada de dados
            System.out.print("Informe o seu nome: ");
            nome = input.nextLine();

            System.out.print("Informe a sua idade: ");
            idade = input.nextInt();

            System.out.print("Informe a sua altura (em metros): ");
            altura = input.nextDouble();

            System.out.print("Informe o seu gênero (M/F): ");
            genero = input.next().charAt(0);

            // Decisão encadeada para exibir mensagem personalizada
            if (idade < 18) {
                System.out.println("Você é menor de idade.");
            } else if (idade >= 18 && idade <= 60) {
                System.out.println("Você é adulto(a).");
            } else {
                System.out.println("Você é idoso(a).");
            }

            // Verificação do gênero para exibir mensagem personalizada
            if (genero == 'M') {
                System.out.println("Você é do sexo masculino.");
            } else if (genero == 'F') {
                System.out.println("Você é do sexo feminino.");
            } else {
                System.out.println("Gênero não identificado.");
            }

            // Exibição dos dados informados pelo usuário
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura + "m");
        }
    }
}
