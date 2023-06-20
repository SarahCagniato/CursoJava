/*
* descrição: Criação de uma classe "qualquer" que tem 11 métodos, com método construtor e possui 10 atributos.
* Autor: Sarah Cagniato
* data: 20/06/2023
* 
*/ 

public class SextaLista_Exe5 {
    public static void main(String[] args) {
        dados criacao = new dados("Sarah", "Fazendinha", "Estudante", "DEsenhar", "Cagniato", 894352895, 943785894, 998122896, 17, 73);

        System.out.println("DADOS PESSOAIS: ");
        System.out.println("Nome: " + criacao.nome);
        System.out.println("Sobrenome: " + criacao.sobrenome);
        System.out.println("Idade: " + criacao.idade);
        System.out.println("CPF: " + criacao.cpf);
        System.out.println("RG: " + criacao.rg);
        System.out.println("Hobby: " + criacao.hoob);
        System.out.println("Bairro: " + criacao.bairro);
        System.out.println("Telefone: " + criacao.numero_telefone);
        System.out.println("Ocupação: " + criacao.ocupacao);
        System.out.println("PEso (KG): " + criacao.peso);
       

        System.out.println(" \n Capacidades: ");
        criacao.andar();
        criacao.pensar();
        criacao.dormir();
        criacao.falar();
        criacao.comer();
        criacao.respirar();
    }
}

class dados{
    //atributos
    String nome,
    bairro,
    ocupacao,
    hoob,
    sobrenome;
    int rg,
    cpf,
    numero_telefone,
    idade,
    peso;
    //Método Construtor
    dados(
        String nome_digitado,
        String bairro_digitado,
        String ocupacao_digitado,
        String hoob_digitado,
        String sobrenome_digitado,
        int rg_digitado,
        int cpf_digitado,
        int numero_telefone_digitado,
        int idade_digitado,
        int peso_digitado
    ){
        this.nome = nome_digitado;
        this.bairro = bairro_digitado;
        this.ocupacao = ocupacao_digitado;
        this.hoob = hoob_digitado;
        this.sobrenome = sobrenome_digitado;
        this.rg = rg_digitado;
        this.cpf = cpf_digitado;
        this.numero_telefone = numero_telefone_digitado;
        this.idade = idade_digitado;
        this.peso = peso_digitado;
    }
    //Métodos
    void andar(){
        System.out.println("Consegue andar");
    }

    void respirar(){
        System.out.println("Consegue respirar");
    }

    void pensar(){
        System.out.println("Sempre pensando");
    }

    void comer(){
        System.out.println("Consegue comer");
    }

    void falar(){
        System.out.println("Consegue falar");
    }

    void dormir(){
        System.out.println("Consegue dormindo");
    }
}