/**
 * Conta Corrente - a famosa CC. Juros de 0.1% por dia, porque banco quer lucro.
 */
public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% por dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }
}
