
/*
Descrição: programa que faça uma contagem de 10 a 0 e mostre "fim" quando
terminada.
Autora: Sarah 
Data: 29/05/23
*/

public class SarahCagniato_5 {
    public static void main(String[] args) {
    // Variável para armazenar o contador
        int count = 10; 
    // Executa o loop enquanto o contador for maior ou igual a zero
        while (count >= 0) { 
    // Imprime o valor atual do contador
            System.out.println(count); 
            count--; // Decrementa o contador em 1 a cada iteração
        }

        System.out.println("fim");
    }
}

