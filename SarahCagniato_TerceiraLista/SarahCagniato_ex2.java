package SarahCagniato_TerceiraLista;

import java.util.Scanner;

public class SarahCagniato_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();
        System.out.print("Números entre os valores: ");
        // Verifica se o primeiro valor é menor que o segundo valor
        // e itera a partir do primeiro valor + 1 até o segundo valor - 1
        if (primeiroValor < segundoValor) {
            for (int i = primeiroValor + 1; i < segundoValor; i++) {
                System.out.print(i + " ");
            }
        } else {
            // Caso o primeiro valor seja maior ou igual ao segundo valor,
            // itera a partir do segundo valor + 1 até o primeiro valor - 1
            for (int i = segundoValor + 1; i < primeiroValor; i++) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
