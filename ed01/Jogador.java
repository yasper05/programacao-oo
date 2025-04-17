/**
* @author Yasmin dos Santos Pereira
* @version 2.0
*/

public class Jogador {
    /*
     * Declara as varivaeis pra classe, tudo privado pra não deixar outro dev burro definindo isso direto na memória
     */
    private String nome;
    private int tentativas;
    private int pontuacao;

    public Jogador(String nome) { //construtor do jgoador, define nome tentativas e pontuação pro valor inicial
        this.nome = nome; 
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Aqui pra baixo são só getters e setters, não acho que preciso comentar um por um
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void incrementarTentativas() {
        this.tentativas++;
    }

    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}
