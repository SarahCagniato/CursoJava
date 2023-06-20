/*
* descrição: Criação de uma Classe "Alimento" com 10 atributos
* Autor: Sarah Cagniato
* data: 12/06/2023
*/ 

public class SextaLista_Exe1 {
    public static void main(String[] args) {
        alimento criacao_alimento = new alimento("Sobremesa", "Bolo de chocolate", "Doce", "chocolate", "macia", 100, 30, 30,60, 70);
        System.out.println(" Informação Sobre o Alimento: ");

        System.out.println(criacao_alimento.Grupo_alimentar);
        System.out.println(criacao_alimento.aroma);
        System.out.println(criacao_alimento.data_compra);
        System.out.println(criacao_alimento.data_venda);
        System.out.println(criacao_alimento.nome);
        System.out.println(criacao_alimento.peso);
        System.out.println(criacao_alimento.preco);
        System.out.println(criacao_alimento.quantidade_estoque);
        System.out.println(criacao_alimento.sabor);
        System.out.println(criacao_alimento.textura);
    
    }
}

class alimento{ 
    //Atributos
    String nome,Grupo_alimentar,sabor,aroma,textura;
    int preco,data_venda,data_compra,peso,quantidade_estoque;
    //Método construtor
    alimento(
        String grupo,
        String nome,
        String sabor,
        String aroma,
        String textura,
        int preco,
        int data_venda,
        int data_compra,
        int peso,
        int quantidade_estoque
    ){
        nome = nome;
        Grupo_alimentar = grupo;  
        sabor = sabor;
        aroma = aroma;
        textura = textura;
        preco = preco;
        data_venda = data_venda;
        data_compra = data_compra;
        peso = peso;
        quantidade_estoque = quantidade_estoque;
    }

}