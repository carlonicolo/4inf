package Sottoclassi;

// Superclasse Veicolo
class Veicolo {
    // protected permette alla varibile di essere visibile dalle sottoclassi
    protected String marca;
    protected int anno;

    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Anno: " + anno);
    }
}
