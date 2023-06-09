/* 
    DESCRIÇÃO: algoritmo que receba um número e mostre: seu sucessor, o número e o seu antecessor
    AUTORA: Sarah
    DATA: 08/04/2023 
*/

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        //pede um número
      System.out.print("Digite um número: ");
      int numero = input.nextInt();
        // calcula o antecessor e o sucessor
      int antecessor = numero - 1;
      int sucessor = numero + 1;
        //mostra os resultados
      System.out.println("O antecessor de " + numero + " é: " + antecessor);
      System.out.println("O número digitado é: " + numero);
      System.out.println("O sucessor de " + numero + " é: " + sucessor);
    }
  }
}
