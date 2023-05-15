/* 
    DESCRIÇÃO: Construa um algoritmo que receba dois valores e troque os valores.
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite o valor A: ");
      int valorA = input.nextInt();

      System.out.print("Digite o valor B: ");
      int valorB = input.nextInt();

      int temp = valorA;
      valorA = valorB;
      valorB = temp;

      System.out.println("Valor A após a troca: " + valorA);
      System.out.println("Valor B após a troca: " + valorB);
    }
  }
}
