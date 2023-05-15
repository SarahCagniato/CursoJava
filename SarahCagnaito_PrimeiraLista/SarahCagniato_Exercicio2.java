/* 
    DESCRIÇÃO: Algoritmo que recebe 4 números, calcule o  quadrado de
    cada um, some todos e mostre o resultado
    AUTORA: Sarah e Evelyn
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // Receber os 4 números do usuário
      System.out.println("Digite 4 números: ");
      double n1 = input.nextDouble();
      double n2 = input.nextDouble();
      double n3 = input.nextDouble();
      double n4 = input.nextDouble();

      // Calcular o quadrado de cada número
      double qn1 = Math.pow(n1, 2);
      double qn2 = Math.pow(n2, 2);
      double qn3 = Math.pow(n3, 2);
      double qn4 = Math.pow(n4, 2);

      // Somar todos os valores
      double resultado = qn1 + qn2 + qn3 + qn4;

      // Mostrar o resultado na tela
      System.out.println("A soma dos quadrados dos números é: " + resultado);
    }
  }
}