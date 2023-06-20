/*
 * descrição: Criação de uma Classe chamada "Cinto"
 * autor: Sarah Cagniato
 * data: 12/06/2023
*/

public class SextaLista_Exe2 {

    public static void main(String[] args) {
        
        cinto haha = new cinto("nome");
        haha.abrir();
        haha.solta();
        haha.ajustando();
        haha.apertar();
        System.out.println(haha.nome_marca());
    
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