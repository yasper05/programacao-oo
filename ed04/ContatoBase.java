package ed04;

/**
 * Classe abstrata que implementa a interface Contato com os campos básicos.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String email;
    private String telefone;

    /**
     * Construtor com todos os parâmetros.
     * @param nome Nome do contato
     * @param email Email do contato
     * @param telefone Telefone do contato
     */
    public ContatoBase(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * Construtor padrão com campos vazios.
     */
    public ContatoBase() {
        this("", "", "");
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    /**
     * Metodo abstrato que retorna os dados no formato CSV.
     * @return representação CSV do contato
     */
    public abstract String toCSV();
}
