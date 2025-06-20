package ed03;

/**
 * Classe abstrata que representa um funcionário genérico.
 * Define os atributos e métodos comuns a todos os tipos de funcionários.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados do funcionário: nome e salário base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Base: " + this.salarioBase);
    }

    /**
     * Met abstrato para calcular o salário final do funcionário.
     * Deve ser implementado pelas subclasses.
     * @return Salário final do funcionário.
     */
    public abstract double calcularSalario();
}
