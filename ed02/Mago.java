/**
 * Mago - frágil, mas destruidor de longe.
 * Habilidade: Bola de Gelo - estoura em todo mundo
 */
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 35);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança uma magia no " + inimigo.nome + "!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano; // defesa de papel
        System.out.println(nome + " não conseguiu se defender bem... tomou " + dano + " de dano");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " conjura BOLA DE GELO!");
        // Só printa, mas poderia atingir vários inimigos.
    }
}
