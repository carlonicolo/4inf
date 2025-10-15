package modulo52Salvador_1;

public class Main {

    public static void main(String[] args) {

        Libro PIPPO = new Libro("Pensa e arricchisci te stesso","Napoleon Hill",1967);

        System.out.println("Titolo : " + PIPPO.getTitolo());
        System.out.println("Autore : " + PIPPO.getAutore());
        System.out.println("Anno pubblicazione: " + PIPPO.getAnnoPubblicazione());

        PIPPO.setAutore("OSHO");
        PIPPO.setTitolo("Trovare se stessi");
        PIPPO.setAnnoPubblicazione(2019);

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Titolo : " + PIPPO.getTitolo());
        System.out.println("Autore : " + PIPPO.getAutore());
        System.out.println("Anno pubblicazione: " + PIPPO.getAnnoPubblicazione());

    }


}
