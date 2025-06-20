package ed03;

/**
 * Interface que define o comportamento de autenticação de usuários.
 */
public interface Autenticavel {

    /**
     * Autentica o usuário com base na senha fornecida.
     * @param senha Senha informada pelo usuário.
     * @return {@code true} se a autenticação for bem-sucedida, caso contrário {@code false}.
     */
    boolean autenticar(String senha);
}

