/*
 * descrição: Criação de uma Classe chamada "Cinto"
 * autor: Sarah Cagniato
 * data: 12/06/2023
*/

public class SextaLista_Exe2 {

    public static void main(String[] args) {
        
        cinto criacao = new cinto("nome");
        criacao.abrir();
        criacao.solta();
        criacao.ajustando();
        criacao.apertar();
        System.out.println(criacao.nome_marca());
    
    }
}

class cinto{
    //atributos
    String nome;

    //metodo construtor
    cinto(String nome_digi){
        nome = nome_digi;
    }

    //metodo
    void abrir(){
        System.out.println("abriu");
    }

    void solta(){
        System.out.println("soltou");
    }

    void ajustando(){
        System.out.println("ajustando");
    }

    void apertar(){
        System.out.println("Apertou");
    }

    String nome_marca(){
        return "Versace";
    }
}
