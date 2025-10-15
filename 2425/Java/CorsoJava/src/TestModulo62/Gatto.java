package TestModulo62;

public class Gatto extends Animale {
    int vite;

    public Gatto(int numeroZampe, boolean coda, String colore, String nome, int vite) {
        super(numeroZampe, coda, colore, nome);
        this.vite = vite;
    }

    @Override
    void suono() {
        System.out.println("Miao");
    }

    public int getVite() {
        return vite;
    }

    public void setVite(int vite) {
        this.vite = vite;
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "vite=" + vite +
                ", numeroZampe=" + numeroZampe +
                ", colore='" + colore + '\'' +
                ", coda=" + coda +
                ", nome='" + nome + '\'' +
                '}';
    }
}
