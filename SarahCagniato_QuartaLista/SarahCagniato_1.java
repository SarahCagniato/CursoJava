
/*
Descrição: programa em java que some todos os números cujo quadrado (x²) for divisível por 4.
Autora: Sarah 
Data: 29/05/23
*/

public class SarahCagniato_1 {
    public static void main(String[] args) {
    // Limite superior para os números a serem verificados
        int limit = 50; 
    // Variável para armazenar a soma dos números
        int sum = 0; 

        for (int i = 1; i <= limit; i++) {
    // Calcula o quadrado do número atual
            int square = i * i; 

            if (square % 4 == 0) {
    // Soma o número base se o quadrado for divisível por 4            
                sum += i; 
                System.out.println(i + "² = " + square + " e " + square + "/4 = " + (square / 4) + ", logo, " + i + "² (" + square + ") é divisível por 4.");
            } else {
                System.out.println(i + "² = " + square + " e " + square + "/4 = " + (square / 4) + ", logo, " + i + "² (" + square + ") não é divisível por 4.");
            }
        }

        System.out.println("A soma dos números cujo quadrado é divisível por 4 é: " + sum);
    }
}

