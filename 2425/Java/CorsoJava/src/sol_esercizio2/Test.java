package sol_esercizio2;

public class Test {
    public static void main(String[] args) {
        Utente pippo = new Utente("Pippo","pippo@pippo.com");
        Libro libro1 = new Libro("Pippo e Pluto","Paperino");
        Prestito prestito1 = new Prestito(20052025,25052025, libro1, pippo);
        System.out.println(prestito1);
    }
}
