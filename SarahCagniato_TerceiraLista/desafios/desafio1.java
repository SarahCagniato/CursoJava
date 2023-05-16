package SarahCagniato_TerceiraLista.desafios;

public class desafio1 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
            contador++;
            if (contador == 10) {
                System.out.println("O número " + i + " é um múltiplo de 10");
                contador = 0;
            }
        }
    }
}