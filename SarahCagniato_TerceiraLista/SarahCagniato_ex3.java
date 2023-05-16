package SarahCagniato_TerceiraLista;

import java.util.Scanner;

public class SarahCagniato_ex3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumeros = 500;
        int contador = 0;
        int soma = 0;
        System.out.println("Insira " + totalNumeros + " números:");

        // Loop para inserção dos números e soma
        while (contador < totalNumeros){
            final int numero = scanner.nextInt();
            soma += numero;
            contador ++;
        }
        // Cálculo da média
        double media = (double) soma / totalNumeros;
        System.out.println("A média dos números inseridos é: " + media);
        scanner.close();
    }
}
