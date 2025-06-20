package ed03;

/**
 * Representa um cliente do sistema, que possui autenticação com critério de senha forte.
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor do cliente.
     * @param login Nome de login do cliente.
     * @param senha Senha do cliente.
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o cliente verificando se a senha tem mais de 6 caracteres e é igual à senha cadastrada.
     * @param senha Senha fornecida para autenticação.
     * @return {@code true} se a senha for válida, caso contrário {@code false}.
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && senha.equals(super.getSenha());
    }

    /**
     * Exibe o login do cliente.
     */
    @Override
    public void exibirLogin() {
        super.exibirLogin();
    }
}
