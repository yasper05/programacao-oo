package ed03;

/**
 * Interface que define o comportamento de registrar logs de operações no sistema.
 */
public interface Logavel {

    /**
     * Registra uma operação realizada pelo usuário.
     * @param operacao Descrição da operação realizada.
     */
    void registrarLog(String operacao);
}

