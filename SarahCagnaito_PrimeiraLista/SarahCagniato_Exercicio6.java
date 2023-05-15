/* 
    DESCRIÇÃO: Calcula o perímetro de um círculo
    AUTORA: Sarah e Evelyn
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // Receber o raio do usuário
      System.out.println("Digite o valor do raio: ");
      double raio = input.nextDouble();

      // Calcular o perímetro do círculo
      double perimetro = 2 * Math.PI * raio;

      // Mostrar o resultado na tela
      System.out.println("O perímetro do círculo é: " + perimetro);
    }
  }
}