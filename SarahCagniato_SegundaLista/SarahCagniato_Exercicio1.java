/* 
    DESCRIÇÃO: Lê um valor inserido pelo usuário e desconte 15% do número inserido
    AUTORA: Sarah e Evelyn
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite um valor: ");
      double valor = input.nextDouble();

      double desconto = valor * 0.15;
      double valorComDesconto = valor - desconto;

      System.out.println("Valor original: R$" + valor);
      System.out.println("Valor com desconto: R$" + valorComDesconto);
    }
  }
}
