package TestModulo62;

public class Cane extends Animale{
    boolean fedele;

    public Cane(int numeroZampe, boolean coda, String colore, String nome, boolean fedele) {
        super(numeroZampe, coda, colore, nome);
        this.fedele = fedele;
    }

    @Override
    void suono() {
        System.out.println("Bau");
    }


    public boolean isFedele() {
        return fedele;
    }

    public void setFedele(boolean fedele) {
        this.fedele = fedele;
    }

    @Override
    public String toString() {
        return "Cane{" +
                "fedele=" + fedele +
                ", coda=" + coda +
                ", numeroZampe=" + numeroZampe +
                ", colore='" + colore + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
