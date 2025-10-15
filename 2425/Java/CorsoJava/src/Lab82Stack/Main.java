package Lab82Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creazione di uno stack di interi
        int numero_rimosso;
        ArrayList<Integer> numeriRimossi = new ArrayList<Integer>();

        Stack numeri = new Stack<>();

        // Inserimento di elementi (push)
        numeri.push(10);
        numeri.push(20);
        numeri.push(30);

        // Visualizzazione dell'elemento in cima (peek)
        System.out.println("Elemento in cima: " + numeri.peek());

        // Rimozione e restituzione dell'elemento in cima (pop)
        //System.out.println("Elemento rimosso: " + numeri.pop());
        numero_rimosso = (int) numeri.pop();
        System.out.println("Numero rimosso: " + numero_rimosso);
        numeriRimossi.add(numero_rimosso);

        numero_rimosso = (int) numeri.pop();
        System.out.println("Numero rimosso: " + numero_rimosso);
        numeriRimossi.add(numero_rimosso);


        numero_rimosso = (int) numeri.pop();
        System.out.println("Numero rimosso: " + numero_rimosso);
        numeriRimossi.add(numero_rimosso);

        for (int i = 0; i < numeriRimossi.size(); i++) {
            System.out.println(numeriRimossi.get(i));
        }

        // Verifica se lo stack è vuoto
        System.out.println("Stack vuoto? " + numeri.isEmpty());

        // Dimensione attuale dello stack
        System.out.println("Dimensione: " + numeri.size());
    }
}