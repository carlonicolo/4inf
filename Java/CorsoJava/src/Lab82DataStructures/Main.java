package Lab82DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Array
        int[] numeri = {1, 2, 3, 4, 5};
        for (int n : numeri) {
            System.out.println(n);
        }

        // ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Mela");
        lista.add("Banana");
        lista.add("Arancia");

        for (String frutto : lista) {
            System.out.println(frutto);
        }

        // LinkedList
        LinkedList<String> nomi = new LinkedList<>();
        nomi.add("Anna");
        nomi.add("Marco");
        nomi.add("Luca");

        nomi.removeFirst(); // Rimuove "Anna"

        for (String nome : nomi) {
            System.out.println(nome);
        }

        // Stack
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        while (!pila.isEmpty()) {
            System.out.println(pila.pop()); // Ritorna 30, 20, 10
        }

        // Queue
        Queue<String> coda = new LinkedList<>();
        coda.add("Cliente1");
        coda.add("Cliente2");

        while (!coda.isEmpty()) {
            System.out.println("Servendo: " + coda.poll());
        }

        // HashMap
        HashMap<String, Integer> voti = new HashMap<>();
        voti.put("Matematica", 28);
        voti.put("Informatica", 30);

        for (String materia : voti.keySet()) {
            System.out.println(materia + ": " + voti.get(materia));
        }

        // HashSet
        HashSet<String> animali = new HashSet<>();
        animali.add("Cane");
        animali.add("Gatto");
        animali.add("Cane"); // Non verrà aggiunto due volte

        for (String animale : animali) {
            System.out.println(animale);
        }
    }
}



