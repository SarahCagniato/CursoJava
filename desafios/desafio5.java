package desafios;
/*
 Descriçã0: Desafio em que o computador recebe uma senha e diz se ta certa
 
 Autora: Sarah
 Data: 15/05/2023
 Ultima atualização: 18/05/2023
 */
import java.util.Scanner;

public class desafio5 {
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String senha;

            //pede p digitar a senha
            do{
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();
            // vê se a senha ta certa
            if (senha.equals("SarahLinda")){
                System.out.println("Senha Correta!");
                break;
            //fala q ta errado
            } else{
                System.out.println("Tente Novamente!");
            }
            }
            while (true);
        }
    }
}
