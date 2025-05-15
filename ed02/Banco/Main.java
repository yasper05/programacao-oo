/**
 * Classe Main. Teste do nosso sistema bancário raiz.
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaYasmin = new ContaCorrente("Yasmin", 1000);
        ContaPoupanca contaEduardo = new ContaPoupanca("Eduardo", 1500);
        ContaSalario contaAna = new ContaSalario("Ana", 1200);

        contaYasmin.depositar(200); // Yasmin ficou mais rica
        contaEduardo.sacar(100);     // Eduardo comprou um lanche
        contaAna.transferir(contaYasmin, 300); // Ana transferiu dinheiro para a Yasmin

        contaYasmin.aplicarJurosDiarios();
        contaEduardo.aplicarJurosDiarios();
        contaAna.aplicarJurosDiarios();

        contaYasmin.imprimirExtrato();
        contaEduardo.imprimirExtrato();
        contaAna.imprimirExtrato();
    }
}
