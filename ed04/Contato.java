package ed04;

/**
 * Interface que define os métodos básicos de um contato.
 */
public interface Contato {

    /**
     * Retorna o nome do contato.
     * @return nome do contato
     */
    String getNome();

    /**
     * Retorna o email do contato.
     * @return email do contato
     */
    String getEmail();

    /**
     * Retorna o telefone do contato.
     * @return telefone do contato
     */
    String getTelefone();

    /**
     * Retorna os dados do contato em formato CSV.
     * @return representação CSV do contato
     */
    String toCSV();
}

