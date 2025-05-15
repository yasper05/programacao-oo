import java.util.Random;

/**
 * Arqueiro - médio, mas traiçoeiro. Pode meter crítico
 * Habilidade: Chuva de Flechas - 3 ataques seguidos. Sai da frente!
 */
public class Arqueiro extends Personagem {
    private Random rand = new Random();

    public Arqueiro(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = rand.nextInt(100) < 25; // 25% de chance de crítico
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + (critico ? " acerta um CRÍTICO em " : " atira em ") + inimigo.nome + " causando " + dano + " de dano!");
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " levou " + dano + " de dano. Precisa de cobertura!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " dispara uma CHUVA DE FLECHAS!");
        // Sem inimigo definido aqui, mas simula o efeito.
    }
}
