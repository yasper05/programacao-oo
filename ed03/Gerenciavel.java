package ed03;

/**
 * Interface que define funcionalidades de gerenciamento de usuários.
 */
public interface Gerenciavel {

    /**
     * Altera a senha do usuário.
     * @param novaSenha Nova senha a ser definida.
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário.
     */
    void bloquearUsuario();
}

