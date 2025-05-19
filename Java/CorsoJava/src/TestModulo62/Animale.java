package TestModulo62;

import java.util.Objects;

class Animale {

    int numeroZampe;
    boolean coda;
    String colore;
    String nome;

    public Animale(int numeroZampe, boolean coda, String colore, String nome) {
        this.numeroZampe = numeroZampe;
        this.coda = coda;
        this.colore = colore;
        this.nome = nome;
    }

    void suono(){
        System.out.println("Verso");
    }

    public int getNumeroZampe() {
        return numeroZampe;
    }

    public void setNumeroZampe(int numeroZampe) {
        this.numeroZampe = numeroZampe;
    }

    public boolean isCoda() {
        return coda;
    }

    public void setCoda(boolean coda) {
        this.coda = coda;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "numeroZampe=" + numeroZampe +
                ", coda=" + coda +
                ", colore='" + colore + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animale animale = (Animale) o;
        return numeroZampe == animale.numeroZampe && coda == animale.coda && Objects.equals(colore, animale.colore) && Objects.equals(nome, animale.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroZampe, coda, colore, nome);
    }
}
