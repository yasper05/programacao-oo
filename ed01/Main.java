import java.util.Scanner;

/**
 * @author Yasmin dos Santos Pereira
 * @version 2.0 -  Com loop infinito
 */
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        boolean continuarJogando = true;

        while (continuarJogando) { //loop
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine(); //Teclado pra pegar o nome

            Jogador jogador = new Jogador(nome);
            Jogo jogo = new Jogo(jogador);
            //define uma nova instância do jogador e do jogo

            boolean acertou = false;
            while (!acertou) {
                System.out.print("Digite um número entre 1 e 100: ");
                if (jogo.jogar(teclado.nextInt())) {
                    System.out.println("Tentativas: " + jogador.getTentativas());
                    System.out.println("Pontuação: " + jogador.getPontuacao());
                    placar.adicionarJogador(jogador);
                    placar.mostrarRanking();
                    teclado.nextLine(); // consumir a quebra de linha pendente
                    acertou = true;
                }
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
            String resposta = teclado.nextLine().trim().toUpperCase();
            if (!resposta.equals("S")) {//se o jogador não quiser continuar jogando
                continuarJogando = false;
            }
        }

        teclado.close();
    }
}
