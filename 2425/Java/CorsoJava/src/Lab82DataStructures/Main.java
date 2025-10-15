package Lab82DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Auto bmw = new Auto("M5","BMW",2025,0);
        Auto mercedes = new Auto("AMG","Mercedes",2024,15000);
        Auto audi = new Auto("S6","AUDI",2023,30000);

        System.out.println("***********************");
        boolean isEqual = bmw.equals(mercedes);
        System.out.println(isEqual);

        int bmwHashCode = bmw.hashCode();
        int mercedesHashCode = mercedes.hashCode();
        int audiHashCode = audi.hashCode();
        System.out.println(bmwHashCode + " " + mercedesHashCode + " " + audiHashCode);

        System.out.println("***********************");

        // Array
        int[] numeri = {1, 2, 3, 4, 5};
        for (int n : numeri) {
            System.out.println(n);
        }

        System.out.println("***********************");

        // ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Mela");
        lista.add("Banana");
        lista.add("Arancia");

        for (String frutto : lista) {
            System.out.println(frutto);
        }

        System.out.println("***********************");

        ArrayList<Auto> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(audi);
        for (Auto car : cars) {
            System.out.println(car);
        }

        System.out.println("***********************");


        // LinkedList
        LinkedList<String> nomi = new LinkedList<>();
        nomi.add("Anna");
        nomi.add("Marco");
        nomi.add("Luca");

        nomi.removeFirst(); // Rimuove "Anna"

        for (String nome : nomi) {
            System.out.println(nome);
        }

        System.out.println("***********************");

        // Stack
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        while (!pila.isEmpty()) {
            System.out.println(pila.pop()); // Ritorna 30, 20, 10
        }

        System.out.println("***********************");

        // Queue
        Queue<String> coda = new LinkedList<>();
        coda.add("Cliente1");
        coda.add("Cliente2");

        while (!coda.isEmpty()) {
            System.out.println("Servendo: " + coda.poll());
        }

        System.out.println("***********************");

        // HashMap
        HashMap<String, Integer> voti = new HashMap<>();
        voti.put("Matematica", 28);
        voti.put("Informatica", 30);

        for (String materia : voti.keySet()) {
            System.out.println(materia + ": " + voti.get(materia));
        }

        System.out.println("***********************");

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



