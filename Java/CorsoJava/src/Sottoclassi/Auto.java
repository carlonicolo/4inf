package Sottoclassi;

// Sottoclasse Auto
class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Numero di porte: " + numeroPorte);
    }
}
