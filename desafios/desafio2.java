package SarahCagniato_TerceiraLista.desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro acima de 1: ");
        int valor = scanner.nextInt();
        for (int i = 1; i <= valor; i++) {
            System.out.println(valor);
        }
        scanner.close();
    }
}