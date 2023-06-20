/*
* descrição: Criação de uma classe chamada "Vovoh" que tem um método construtor
* autor: Sarah Cagniato
* data: 20/06/2023
* 
*/ 

public class SextaLista_Exe4 {
    public static void main(String[] args) {
        vovoh familiar = new vovoh("MAdalena", "madalena@yahoo.com", 70, 001);
        System.out.println("Informação da vovó: ");
        System.out.println("Nome: " + familiar.nome);
        System.out.println("E-mail: " + familiar.email);
        System.out.println("Idade: " + familiar.idade);
        System.out.println("Número do CVV do cartão: " + familiar.senha_do_cartao);
    }
}

class vovoh{
    //Atributos
    String nome,email;
    int idade,senha_do_cartao;
    //Método Construtor
    vovoh(
        String nome_digi,
        String email_digi, 
        int idade_digi, 
        int numero_cartao_digi
    ){
        this.nome = nome_digi;
        this.email = email_digi;
        this.idade = idade_digi;
        this.senha_do_cartao = numero_cartao_digi;
    }
}