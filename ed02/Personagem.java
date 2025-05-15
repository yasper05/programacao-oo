/**
 * Classe base Personagem - todo mundo do RPG herda dela
 * Tem nome, HP (vida) e ataqueBase. Serve pra bater e apanhar
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor padrão pra qualquer personagem
     * @param nome Nome do herói (ou vilão)
     * @param hp Pontos de vida
     * @param ataqueBase Força base do ataque
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Ataca o inimigo. Quem vai definir como é o ataque é a subclasse
     * @param inimigo Quem vai levar porrada
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Leva dano. Cada classe pode lidar com isso de um jeito
     * @param dano Quanto de pancada vai levar
     */
    public abstract void defender(int dano);

    /**
     * Habilidade cabulosa única de cada classe
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Mostra o status atual do personagem. Tipo vida e ataque
     */
    public void status() {
        System.out.println(">>> " + nome + " | HP: " + hp + " | ATQ: " + ataqueBase);
    }

    /**
     * Só pra verificar se já bateu as botas
     * @return true se ainda tá vivo
     */
    public boolean estaVivo() {
        return hp > 0;
    }
}
