package Lab82ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // Creazione di un ArrayList di stringhe
        ArrayList frutta = new ArrayList<>();

        // Aggiunta di elementi
        frutta.add("Mela");
        frutta.add("Banana");
        frutta.add("Arancia");

        // Accesso a un elemento per indice
        System.out.println("Elemento in posizione 1: " + frutta.get(1));

        // Modifica di un elemento
        frutta.set(0, "Pera");

        // Inserimento in una posizione specifica
        frutta.add(1, "Kiwi");

        // Rimozione di un elemento
        frutta.remove(2); // Rimuove "Banana"

        // Ordinamento dell'ArrayList
        Collections.sort(frutta);

        // Iterazione sugli elementi
        for (Object f : frutta) {
            System.out.println(f);
        }

        // Dimensione dell'ArrayList
        System.out.println("Numero di frutti: " + frutta.size());

        // Verifica se un elemento è presente
        boolean contienePera = frutta.contains("Pera");
        System.out.println("Contiene Pera? " + contienePera);
    }
}
