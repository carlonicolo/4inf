package INF62Lab2;

import java.util.*;

abstract class Veicolo {
    String modello;
    Veicolo(String modello) { this.modello = modello; }
    abstract void mostraInfo();
}

interface Trasportabile {
    void carica();
}

class Automobile extends Veicolo {
    Automobile(String modello) { super(modello); }
    void mostraInfo() { System.out.println("Auto: " + modello); }
}

class Moto extends Veicolo {
    Moto(String modello) { super(modello); }
    void mostraInfo() { System.out.println("Moto: " + modello); }
}

class Camion extends Veicolo implements Trasportabile {
    Camion(String modello) { super(modello); }
    void mostraInfo() { System.out.println("Camion: " + modello); }
    public void carica() { System.out.println("Carico caricato!"); }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Veicolo> lista = new ArrayList<>();
        lista.add(new Automobile("Fiat Punto"));
        lista.add(new Moto("Yamaha R6"));
        lista.add(new Camion("Iveco Eurocargo"));

        for (Veicolo v : lista) {
            v.mostraInfo();
            if (v instanceof Trasportabile t)
                t.carica();
        }
    }
}
