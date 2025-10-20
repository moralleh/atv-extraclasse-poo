package model;

public class Bibliotecario extends Usuario{

    public Bibliotecario(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void cadastrarLivro(){
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void retirarLivro(){
        System.out.println("Livro retirado com sucesso!");
    }
    @Override
    public String exibirAcoesDisponiveis() {
        super.exibirAcoesDisponiveis();
         return "1. Gerenciar Usuario";
    }

}
