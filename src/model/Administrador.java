package model;

public class Administrador extends Usuario{

    public Administrador(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    public void gerenciarUsuario(){
        System.out.println("Gerenciando usuários...");
    }

    @Override
    public String exibirAcoesDisponiveis(){
        super.exibirAcoesDisponiveis();
         return "1. Gerenciar usuario";
    }
    
}
