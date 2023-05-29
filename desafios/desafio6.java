package desafios;
/*
 Descriçã0: Desafio do estoque
 
 Autora: Sarah
 Data: 15/05/2023
 Ultima atualização: 18/05/2023
 */
import java.util.Scanner;

public class desafio6 {
    /**
     * @param args
     */
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //iniciando variaveis
            String opcao;
            int estoque = 0;
            //mostrando o menu
        do{
            System.out.println("\n Menu de opções");
            System.out.println("X - Fechar o programa");
            System.out.println("A - Adicionar uma unidade em estoque");
            System.out.println("B - Subrai unidade em estoque");
            System.out.println("C - mostra total em estoque");

            System.out.println("O que tu quer? ");
            opcao = scanner.nextLine().toUpperCase();
            //caso o usuario digite X
            switch (opcao){
                case "x":
                System.out.println("Programa encerrado");
                break;
            //caso o usuario digite A
                case "a":
                estoque ++;
                System.out.println("Uma unidade adicionada ao estoque");
                break;
            //caso o usuario digite B
                case "b":
                if (estoque > 0) {
                    estoque --;
                    System.out.println("Uma unidade adicionada ao estoque.");
                } else {
                    System.out.println("Estoque vazio. Não é possivel extrair unidades");
                }
                break;
            //caso o usuario digite C
                case "c":
                System.out.print("Total em estoque: " + estoque);
                break;
            // caso o usario não digitar nenhuma das opções válidas
                default:
                System.out.println("Opção inválida. Tente novamente");
                }
            } while (!opcao.equals("X"));
        }
    }
}
