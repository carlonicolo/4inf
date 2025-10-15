package Lab82Queue;

import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {

        // Creazione di una coda utilizzando LinkedList come implementazione
        Queue codaClienti = new LinkedList<>();

        // Aggiunta di elementi alla coda (enqueue)
        codaClienti.offer("Cliente 1");
        codaClienti.offer("Cliente 2");
        codaClienti.offer("Cliente 3");

        // Visualizzazione del prossimo cliente senza rimuoverlo
        System.out.println("Prossimo cliente: " + codaClienti.peek());

        // Servizio del cliente (dequeue)
        String clienteServito = (String) codaClienti.poll();
        System.out.println("Cliente servito: " + clienteServito);

        // Visualizzazione del nuovo prossimo cliente
        System.out.println("Nuovo prossimo cliente: " + codaClienti.peek());

        // Verifica se la coda è vuota
        System.out.println("Coda vuota? " + codaClienti.isEmpty());

        // Numero di clienti ancora in attesa
        System.out.println("Clienti in attesa: " + codaClienti.size());

        // Iterazione sulla coda (senza rimuovere elementi)
        System.out.println("Clienti in coda:");
        for (Object cliente : codaClienti) {
            System.out.println(cliente);
        }
    }
}