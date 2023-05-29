package desafios;
/*
 Descriçã0: Desafio em que o computador calcula a média dos alunos e mostra quem foi aprovado ou reprovado
 mínimo para ser aproavdo: média = 5
 
 Autora: Sarah
 Data: 15/05/2023
 Ultima atualização: 18/05/2023
 */
import java.util.Scanner;

public class desafio4 {
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int aprovados = 0;
            int reprovados = 0;
            double media, nota1, nota2;

            System.out.println("Digite as notas dos alunos. Digite -1 para encerrar.");
                //pede p digitar as nota 
            while(true){
                System.out.println("Digite a Primeira nota: ");
                nota1 = scanner.nextDouble();

                if (nota1 == -1){
                    break;
                }
                System.out.println("Digite a Segunda nota: ");
                nota2 = scanner.nextDouble();

                media = (nota1 + nota2) / 2.0;
                //calcula a media
                if (media > 5) {
                    System.out.println("Aprovado");
                    aprovados++;
                } else {
                    System.out.println("Reprovado");
                    reprovados++;
                }
            }
                //mostra quem passou ou não
            System.out.println("Quantidade de Aprovados: " + aprovados);
            System.out.println("Quantidade de Reprovados: " + reprovados);
        }
    }
}
