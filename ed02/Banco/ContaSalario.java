/**
 * Conta Salário — pra receber mesmo
 */
public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Sem juros mesmo, paciência.
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Salário");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }
}
