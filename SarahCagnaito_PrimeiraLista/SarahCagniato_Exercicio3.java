/* 
    DESCRIÇÃO: Calcula a conversão do número inserido pelo usuário de reais para dólar.
    AUTORA: Sarah e Evelyn
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        
        // define a cotação atual do dólar
        double cotacao = 4.95;
        
        try (// cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in)) {
            // pede ao usuário para inserir um valor em reais
            System.out.print("Insira um valor em reais: ");
            double valorReal = scanner.nextDouble();
            
            // converte o valor de reais para dólares com base na cotação atual
            double valorDolar = valorReal / cotacao;
            
            // exibe o resultado para o usuário
            System.out.printf("R$ %.2f equivale a US$ %.2f", valorReal, valorDolar);
        }
    }

}