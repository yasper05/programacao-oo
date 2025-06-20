package ed04;

/**
 * Representa um contato do tipo Pessoa Jurídica.
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Construtor completo.
     * @param nome Nome do contato
     * @param email Email do contato
     * @param telefone Telefone do contato
     * @param cnpj CNPJ da pessoa jurídica
     */
    public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
        super(nome, email, telefone);
        this.cnpj = cnpj;
    }

    /**
     * Construtor apenas com CNPJ.
     * @param cnpj CNPJ da pessoa jurídica
     */
    public PessoaJuridica(String cnpj) {
        super();
        this.cnpj = cnpj;
    }

    /**
     * Construtor padrão.
     */
    public PessoaJuridica() {
        super();
        this.cnpj = "";
    }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    @Override
    public String toCSV() {
        return String.format("PJ;%s;%s;%s;%s", getNome(), getEmail(), getTelefone(), cnpj);
    }

    @Override
    public String toString() {
        return "Pessoa Juridica [Nome= " + getNome() + ", Email= " + getEmail() +
                ", Telefone= " + getTelefone() + ", CNPJ= " + cnpj + "]";
    }
}
