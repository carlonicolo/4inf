package modulo52Salvador_2;

public class Prestito {

    private int dataInizio;
    private int dataFine;
    private Utente utente;
    private Libro libro;


    public Prestito(int dataInizio, int datFine, String autore, String titolo, String nome, String email){

        this.dataInizio = dataInizio;
        this.dataFine = datFine;
        this.libro = new Libro("","");
        this.utente = new Utente("","");
    }

    public int getDataFine() {
        return dataFine;
    }

    public void setDataFine(int dataFine) {
        this.dataFine = dataFine;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getDatFine() {
        return dataFine;
    }

    public void setDatFine(int datFine) {
        this.dataFine = datFine;
    }

    public int getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(int dataInizio) {
        this.dataInizio = dataInizio;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", utente=" + utente +
                ", libro=" + libro +
                '}';
    }
}
