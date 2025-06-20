package ed03;

/**
 * Classe abstrata que representa um usuário genérico do sistema.
 * Fornece atributos e métodos básicos para login e gerenciamento de senha.
 */
public abstract class Usuario {
    private String login;
    private String senha;

    /**
     * Construtor da classe Usuario.
     * @param login Nome de login do usuário.
     * @param senha Senha do usuário.
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário no console.
     */
    public void exibirLogin() {
        System.out.println("Login: " + this.login);
    }

    /**
     * Retorna a senha atual do usuário.
     * @return Senha do usuário.
     */
    public String getSenha() {
        return this.senha;
    }

    /**
     * Define uma nova senha para o usuário.
     * @param senha Nova senha a ser atribuída.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

