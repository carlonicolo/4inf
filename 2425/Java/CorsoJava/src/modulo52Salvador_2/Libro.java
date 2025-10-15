package modulo52Salvador_2;

public class Libro {

    private String autore;
    private String titolo;


    public Libro(String autore, String titolo){

        this.autore = autore;
        this.titolo = titolo;

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}

