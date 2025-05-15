/**
 * Classe abstrata Conta
 * Guarda o nome do cliente e o saldo. Tem as paradas padrão: depositar, sacar, transferir, etc
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor básico pra criar a conta com nome e saldo inicial
     * @param cliente Nome do dono da conta
     * @param saldo Saldo inicial (se começar zerado, também funciona)
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Joga dinheiro na conta
     * @param valor Valor que vai cair na conta
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Saca dinheiro da conta. Se tiver grana
     * @param valor Quanto vai sair da conta
     */
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Sem grana suficiente");
        }
    }

    /**
     * Transfere grana pra outra conta
     * @param destino A outra conta que vai receber o dinheiro
     * @param valor Quanto vai ser transferido
     */
    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("A transferência falhou");
        }
    }

    /**
     * Retorna quanto de grana tem na conta
     * @return Saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Cada tipo de conta imprime o extrato de um jeitinho
     */
    public abstract void imprimirExtrato();

    /**
     * Aplica os juros do dia. Varia de conta pra conta
     */
    public abstract void aplicarJurosDiarios();
}
