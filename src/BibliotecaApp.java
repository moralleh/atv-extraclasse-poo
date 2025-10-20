import java.util.ArrayList;

import model.Administrador;
import model.Bibliotecario;
import model.Leitor;
import model.Usuario;

public class BibliotecaApp {
    public static void main(String[] args) throws Exception {
        ArrayList <Usuario> listaDeUsuarios = new ArrayList<>();

        Leitor leitor1 = new Leitor("Ana Silva", "ana.silva@email.com", "15/10/2025");
        Bibliotecario biblio1 = new Bibliotecario("Carlos Souza", "carlos.souza@email.com", "10/08/2024");
        Administrador admin1 = new Administrador("Marcos Roberto", "marcos.roberto@email.com", "01/01/2023");

        listaDeUsuarios.add(leitor1);
        listaDeUsuarios.add(biblio1);
        listaDeUsuarios.add(admin1);

        System.out.println("--- Testando Polimorfismo no Sistema da Biblioteca ---");
        
        for (Usuario usuario : listaDeUsuarios) {
            System.out.println("\n--------------------------------------------");
            System.out.println("Dados do Usuário:");
            System.out.println(usuario.exibirDados()); // Método da superclasse

            System.out.println("\nAções Disponíveis para o Perfil:");
            // Aqui a mágica do polimorfismo acontece!
            // O Java decide em tempo de execução qual versão do método chamar.
            System.out.println(usuario.exibirAcoesDisponiveis());
            System.out.println("--------------------------------------------");
        }
    }
}
