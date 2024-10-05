package client;

import lutador.*;
import artemarcial.*;

public class Client {
    public static void main(String[] args) {
        ArteMarcial karate = new Karate();
        ArteMarcial judo = new Judo();
        ArteMarcial jiuJitsu = new JiuJitsu();

        Lutador lutadorBrasileiro = new LutadorBrasileiro(karate);
        Lutador lutadorJapones = new LutadorJapones(judo);

        System.out.println("Lutador Brasileiro:");
        lutadorBrasileiro.doAttack();
        lutadorBrasileiro.doDefend();

        System.out.println("\nLutador Japonês:");
        lutadorJapones.doAttack();
        lutadorJapones.doDefend();

        lutadorBrasileiro.setArteMarcial(jiuJitsu);

        System.out.println("\nLutador Brasileiro (com Jiu-Jitsu):");
        lutadorBrasileiro.doAttack();
        lutadorBrasileiro.doDefend();
    }
}

