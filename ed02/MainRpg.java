/**
 * Classe MainRpg - Aqui rola a luta
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro Hercules = new Guerreiro("Hercules");
        Mago harry = new Mago("Harry");
        Arqueiro Angelo = new Arqueiro("Angelo");

        Hercules.status();
        harry.status();
        Angelo.status();

        Hercules.atacar(harry);
        harry.usarHabilidadeEspecial();
        Angelo.usarHabilidadeEspecial();

        Hercules.status();
        harry.status();
        Angelo.status();
    }
}
