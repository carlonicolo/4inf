package Lab82Thread;

class Stampatore extends Thread {
    private int id;
    public Stampatore(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + id + ": " + i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Stampatore(i).start();
        }
    }
}