package Sottoclassi;

public class Main {
    public static void main(String[] args) {
        Veicolo veicolo = new Veicolo("Mercedes",2020);
        String veicoloClass = veicolo.getClass().getName();
        System.out.println(veicoloClass);
        veicolo.stampaDettagli();
        System.out.println("");

        // Auto
        Auto bmw = new Auto("BMW",2024,5);
        String autoClass = bmw.getClass().getName();
        System.out.println(autoClass);
        bmw.stampaDettagli();
        System.out.println("");

        // Moto
        Moto hornet = new Moto("Hornet",2020,600);
        String motoClass = hornet.getClass().getName();
        System.out.println(motoClass);
        hornet.stampaDettagli();
    }
}