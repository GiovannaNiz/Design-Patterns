package lutador;

import artemarcial.ArteMarcial;

public class LutadorJapones extends LutadorImpl {
    public LutadorJapones(ArteMarcial arteMarcial) {
        super(arteMarcial);
    }

    @Override
    public void doAttack() {
        System.out.print("Lutador Japonês ataca com ");
        super.doAttack();
    }

    @Override
    public void doDefend() {
        System.out.print("Lutador Japonês defende com ");
        super.doDefend();
    }
}
