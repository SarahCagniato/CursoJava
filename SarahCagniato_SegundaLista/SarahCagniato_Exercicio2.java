/* 
    DESCRIÇÃO: Monte um algoritmo para receber 3 números e que mostre qual número inserido é o maior.
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite o primeiro número: ");
      int numero1 = input.nextInt();

      System.out.print("Digite o segundo número: ");
      int numero2 = input.nextInt();

      System.out.print("Digite o terceiro número: ");
      int numero3 = input.nextInt();

      int maior = numero1;

      if (numero2 > maior) {
        maior = numero2;
      }

      if (numero3 > maior) {
        maior = numero3;
      }

      System.out.println("O maior número é: " + maior);
    }
  }
}

