package ed03;

/**
 * Classe que representa um funcionário CLT.
 * Recebe um adicional fixo de R$ 300,00 sobre o salário base.
 */
public class FuncionarioCLT extends Funcionario {

    /**
     * Construtor da classe FuncionarioCLT.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final com adicional de R$ 300,00.
     * @return Salário final do funcionário CLT.
     */
    @Override
    public double calcularSalario() {
        return this.salarioBase + 300;
    }
}

