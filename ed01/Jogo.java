import java.util.Random;
import java.util.Scanner;

/**
 * @author Yasmin dos Santos Pereira
 * @version 2.0
 */

public class Jogo {
    private Jogador jogador; //Define o jogador, deixa como privado pra não sairem definindo o valor direto
    private int numeroSecreto; //Define o número pra advinhar, privado igual o de cima

    public Jogo(Jogador jogador) { //Construtor do objeto, define o jogador e o número secreto
        this.jogador = jogador; //Define o jogador com o jogador passado como parametro pelo jogador
        this.numeroSecreto = new Random().nextInt(100) + 1; //Define o número secreto, Random devolve algo entre 0 e o valor que eu passei, eu boto +1 pra não ser 0, mas também não teria problema ser 0, só que teria que tankar números negativos, mo trampo
    }

    public boolean jogar(int tentativa) {       // Função de jogar, verifica se o jogador acertou o número
        Scanner teclado = new Scanner(System.in); //Carrega pra conseguir ler o teclado

        jogador.incrementarTentativas(); //Aumentou a quantidade de vez que o jogador tentou
        if (tentativa > numeroSecreto) { //Verifica se é maior que o número secreto
            System.out.println("O número é menor, tente novamente");
            return false;  //retorna o erro
        } else if (tentativa < numeroSecreto) { //Verifica se é menor que o número secreto
            System.out.println("O número é maior, tente novamente");
            return false; //retorna o erro 
        } else { //Se não for nem maior nem menor, então é o mesmo
            int pontos = 100 - jogador.getTentativas() * 10; //tira 10 pontos por tentativa, e começa com 100
            jogador.atualizarPontuacao(Math.max(pontos, 0)); 
            System.out.println("Você acertou!");
            return true; //gg
        }
    }
}
