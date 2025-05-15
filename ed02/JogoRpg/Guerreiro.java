/**
 * Guerreiro - o bruto da espada. Bate forte, apanha pouco
 * Habilidade: Golpe triplo - bate duas vezes de uma vez só
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " dá uma espadada no " + inimigo.nome + "!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        System.out.println(nome + " defendeu como um tanque! Sofreu só " + danoReduzido + " de dano");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa GOLPE DUPLO! O inimigo vai sentir...");
        // Golpe duplo fictício no ar (pra teste). Pode adaptar depois pra um inimigo real
    }
}
