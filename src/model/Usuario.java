package model;

public abstract class Usuario {
    protected String nome;
    private String email;
    private String dataCadastro;
    
    public Usuario(String nome, String email, String dataCadastro2) {
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro2;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String exibirAcoesDisponiveis(){
        return "Acoes basicas do sistema: ";
    }

    public String exibirDados() {
        return "Nome: " + nome +
                "\nEmail: " + email +
                "\nData de Cadastro: " + dataCadastro;

    }

}
