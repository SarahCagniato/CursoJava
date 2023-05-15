/* 
    DESCRIÇÃO: Produza um algoritmo que receba a quantidade de picolés de Kiwi, Laranja e Romã
a ser comprado e calcule o valor total da compra e mostre-a.
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double precoKiwi = 3.20;
      double precoLaranja = 2.39;
      double precoRoma = 7.99;

      System.out.print("Quantidade de picolés de Kiwi a ser comprado: ");
      int quantidadeKiwi = input.nextInt();

      System.out.print("Quantidade de picolés de Laranja a ser comprado: ");
      int quantidadeLaranja = input.nextInt();

      System.out.print("Quantidade de picolés de Romã a ser comprado: ");
      int quantidadeRoma = input.nextInt();

      double total = (quantidadeKiwi * precoKiwi) + (quantidadeLaranja * precoLaranja) + (quantidadeRoma * precoRoma);

      System.out.println("O valor total da compra é: R$ " + total);
    }
  }
}
