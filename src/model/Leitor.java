package model;

public class Leitor extends Usuario{
    
    public Leitor(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void consultarLivro(){
        System.out.printf("O leitor %c está consultando um livro", nome);
    }

    public void reservarLivro(){
        System.out.printf("O leitor %c está reservando um livro", nome);
    }

    @Override
    public String exibirAcoesDisponiveis(){
        super.exibirAcoesDisponiveis();
         return "1. Consultar livro \n2. Reservar livro";
    }
}
