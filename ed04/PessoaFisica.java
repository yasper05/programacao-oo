package ed04;

/**
 * Representa um contato do tipo Pessoa Física.
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Construtor completo.
     * @param nome Nome do contato
     * @param email Email do contato
     * @param telefone Telefone do contato
     * @param cpf CPF da pessoa física
     */
    public PessoaFisica(String nome, String email, String telefone, String cpf) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    /**
     * Construtor apenas com CPF.
     * @param cpf CPF da pessoa física
     */
    public PessoaFisica(String cpf) {
        super();
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override
    public String toCSV() {
        return String.format("PF;%s;%s;%s;%s", getNome(), getEmail(), getTelefone(), cpf);
    }

    @Override
    public String toString() {
        return "Pessoa Fisica [Nome= " + getNome() + ", Email= " + getEmail() +
                ", Telefone= " + getTelefone() + ", CPF= " + cpf + "]";
    }
}
