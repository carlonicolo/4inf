package sol_esercizio2;

public class Prestito {
    private int dataInizio;
    private int dataFine;
    private Libro libro;
    private Utente utente;

    public Prestito(int dataInizio, int dataFine, Libro libro, Utente utente) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.libro = libro;
        this.utente = utente;
    }

    public int getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(int dataInizio) {
        this.dataInizio = dataInizio;
    }

    public int getDataFine() {
        return dataFine;
    }

    public void setDataFine(int dataFine) {
        this.dataFine = dataFine;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", libro=" + libro +
                ", utente=" + utente +
                '}';
    }
}
