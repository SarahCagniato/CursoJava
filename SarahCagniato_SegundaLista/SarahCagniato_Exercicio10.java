/* 
    DESCRIÇÃO: ALgoritmo que recebe dois números e diz qual é maior ou se são iguais
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Variáveis
            int num1, num2;

            // Entrada de dados
            System.out.print("Informe o primeiro número: ");
            num1 = input.nextInt();

            System.out.print("Informe o segundo número: ");
            num2 = input.nextInt();

            // Comparação dos números
            if (num1 == num2) {
                System.out.println("Os números são iguais.");
            } else if (num1 > num2) {
                System.out.println("O primeiro número é maior.");
            } else {
                System.out.println("O segundo número é maior.");
            }
        }
    }
}
