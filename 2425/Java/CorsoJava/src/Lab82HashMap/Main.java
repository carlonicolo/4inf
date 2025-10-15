package Lab82HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creazione di una HashMap che associa nomi a età
        HashMap eta = new HashMap<>();

        // Inserimento di coppie chiave-valore
        eta.put("Marco", 25);
        eta.put("Laura", 30);
        eta.put("Giovanni", 22);
        eta.put("Marie", 21);

        // Accesso a un valore tramite chiave
        System.out.println("Età di Laura: " + eta.get("Laura"));

        // Verifica se una chiave esiste
        if (eta.containsKey("Antonio")) {
            System.out.println("Antonio è presente");
        } else {
            System.out.println("Antonio non è presente");
        }

        for (Object key : eta.keySet()) {
            Integer value = (Integer) eta.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }


        // Rimozione di una entry
        eta.remove("Giovanni");
        // Dimensione della mappa
        System.out.println("Numero di persone: " + eta.size());
    }
}