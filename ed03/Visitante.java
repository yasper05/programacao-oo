package ed03;

/**
 * Representa um visitante do sistema, com acesso restrito e sem autenticação.
 */
public class Visitante extends Usuario {

    /**
     * Construtor do visitante.
     * @param login Nome de login.
     * @param senha Senha (não utilizada para autenticação).
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Exibe mensagem de acesso restrito para visitantes.
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema");
    }
}

