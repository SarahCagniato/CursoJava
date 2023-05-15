/* 
    DESCRIÇÃO: Engenhe um algoritmo que calcule a área de um triângulo e mostre-a
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite a base do triângulo: ");
      double base = input.nextDouble();

      System.out.print("Digite a altura do triângulo: ");
      double altura = input.nextDouble();

      double area = (base * altura) / 2;

      System.out.println("A área do triângulo é: " + area);
    }
  }
}
