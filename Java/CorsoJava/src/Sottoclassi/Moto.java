package Sottoclassi;

// Sottoclasse Moto
class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, int anno, int cilindrata) {
        super(marca, anno);
        this.cilindrata = cilindrata;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Anno: " + anno +
                ", Cilindrata: " + cilindrata + " cc");
    }
}