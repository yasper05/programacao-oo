/**
 * Conta Poupança — rendendo um tiquinho por dia (0.08%). Ideal pra deixar guardado.
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% por dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }
}
