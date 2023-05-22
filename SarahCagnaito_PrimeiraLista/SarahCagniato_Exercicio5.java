/* 
    DESCRIÇÃO: Mostra a faixa etária do usuário baseado na sua idade
    AUTORA: Sarah
    DATA: 12/04/2023 
*/

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // Receber a idade do usuário
      System.out.println("Digite a sua idade: ");
      int idade = input.nextInt();

      // Verificar a faixa etária do usuário
      if (idade <= 12) {
        System.out.println("Você é uma criança!");
      } else if (idade <= 19) {
        System.out.println("Você é um adolescente!");
      } else if (idade <= 65) {
        System.out.println("Você é um adulto!");
      } else {
        System.out.println("Você é um idoso!");
      }
    }
  }
}
