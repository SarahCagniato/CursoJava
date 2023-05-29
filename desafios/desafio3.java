package desafios;
/*
 Descriçã0: Desafio em que o computador pega números e calcula qual é o maior.
 O programa encerra quando o usuário digita "0"
 
 Autora: Sarah
 Data: 15/05/2023
 Ultima atualização: 18/05/2023
 */
import java.util.Scanner;

public class desafio3 {
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroMaior = Integer.MIN_VALUE;
            int numero;

            System.out.println("Digite uma série de números inteiros positivos. Digite 0 (zero) para encerrar");
            //pede os numeros
            do{
                System.out.println("Digite um número:");
                numero = scanner.nextInt();
                if (numero > numeroMaior){
                    numeroMaior = numero;
                }
                //calcula o maior
            }while(numero != 0);
            System.out.println("O maior número digitado foi: " + numeroMaior);
        }
    }
}
