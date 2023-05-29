
/*
Descrição: código que recebe três números, e enquanto a soma deles for diferente
de 48 ou 71, continue recebendo três valores infinitamente.
Autora: Sarah 
Data: 29/05/23
*/

import java.util.Scanner;

public class SarahCagniato_2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        try (Scanner input = new Scanner(System.in)) { 
        // Variável para armazenar a soma dos números
        
            int soma = 0; 
        // Executa o loop enquanto a soma não for igual a 48 nem igual a 71
            while (soma != 48 && soma != 71) { 
                System.out.println("Digite três números: ");
        // Lê o primeiro número digitado pelo usuário        
                int number1 = input.nextInt(); 
        // Lê o segundo número digitado pelo usuário        
                int number2 = input.nextInt(); 
        // Lê o terceiro número digitado pelo usuário        
                int number3 = input.nextInt(); 

        // Calcula a soma dos três números e atribui à variável "sum"        
                soma = number1 + number2 + number3; 
            }
        }
        // Exibe a mensagem de encerramento do programa
        System.out.println("A soma é igual a 48 ou 71. Fim do programa."); 
    }
}

