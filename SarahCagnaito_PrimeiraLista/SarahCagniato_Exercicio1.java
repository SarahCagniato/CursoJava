/* 
    DESCRIÇÃO: Algoritmo que lê 4 números e some
    AUTORA: Sarah
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //pede o primeiro número 
            System.out.println("Digite o primeiro número:");
            int n1 = scanner.nextInt();
            //pede o segundo número 
            System.out.println("Digite o segundo número:");
            int n2 = scanner.nextInt();
            //pede o terceiro número 
            System.out.println("Digite o terceiro número:");
            int n3 = scanner.nextInt();
            //pede o quarto número 
            System.out.println("Digite o quarto número:");
            int n4 = scanner.nextInt();
            //calcula o resultado
            int resultado = n1 + n2 + n3 + n4;
            //mostra a soma
            System.out.println("A soma dos números é: " + resultado);
        }
    }
}
