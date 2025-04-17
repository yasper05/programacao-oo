import java.util.ArrayList;
/**
* @author Yasmin dos Santos Pereira
* @version 2.0
*/
public class Placar {
    private ArrayList<Jogador> ranking; //Cria uma Lista de jogadores no ranking

    public Placar() { //Construtor do Placar, inicializa a lista de jogadores
        this.ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j) { //Adiciona o jogador ao ranking
        ranking.add(j);
    }

    public void mostrarRanking() { //Mostra o ranking
        System.out.println("--- RANKING ---");
        for (Jogador j : ranking) { //Faz um loop em todos os jogadores do ranking
            System.out.println(j.getNome() + ": " + j.getPontuacao() + " pontos"); //Mostra o nome e a pontuação de cada jogador
        }
    }
}