/* 
    DESCRIÇÃO: Monte um algoritmo para receber 3 números e que mostre qual número inserido é o maior.
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
       //pede o primeiro número 
      System.out.print("Digite o primeiro número: ");
      int numero1 = input.nextInt();
       //pede o segundo número 
      System.out.print("Digite o segundo número: ");
      int numero2 = input.nextInt();
       //pede o terceiro número 
      System.out.print("Digite o terceiro número: ");
      int numero3 = input.nextInt();
       // calcula o maior numero
      int maior = numero1;

      if (numero2 > maior) {
        maior = numero2;
      }

      if (numero3 > maior) {
        maior = numero3;
      }
            //mostra o resultado
      System.out.println("O maior número é: " + maior);
    }
  }
}

