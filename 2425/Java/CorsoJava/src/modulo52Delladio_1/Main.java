package modulo52Delladio_1;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Pinocchio", "Pippo", 1998);
        System.out.println(libro1.getTitolo());
        System.out.println(libro1.getAutore());
        System.out.println(libro1.getAnnoPubblicazione());

        System.out.println("OPS! HO SBAGLIATO IL TITOLO!ADESSO MI CORREGGO!");
        libro1.setTitolo("Il libro della giungla");
        System.out.println(libro1.getTitolo());
        System.out.println(libro1.getAutore());
        System.out.println(libro1.getAnnoPubblicazione());
        System.out.println("\n"+"così è corretto ;D");






    }
}
