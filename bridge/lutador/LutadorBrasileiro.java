package lutador;

import artemarcial.ArteMarcial;

public class LutadorBrasileiro extends LutadorImpl {
    public LutadorBrasileiro(ArteMarcial arteMarcial) {
        super(arteMarcial);
    }

    @Override
    public void doAttack() {
        System.out.print("Lutador Brasileiro ataca com ");
        super.doAttack();
    }

    @Override
    public void doDefend() {
        System.out.print("Lutador Brasileiro defende com ");
        super.doDefend();
    }
}
