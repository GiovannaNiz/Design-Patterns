package lutador;

import artemarcial.ArteMarcial;

public class LutadorImpl implements Lutador {
    protected ArteMarcial arteMarcial;

    public LutadorImpl(ArteMarcial arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    public void setArteMarcial(ArteMarcial arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    @Override
    public void doAttack() {
        arteMarcial.doAttack();
    }

    @Override
    public void doDefend() {
        arteMarcial.doDefend();
    }
}
