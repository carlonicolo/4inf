package Lab82AdvancedThread;

public class MyRunnable implements Runnable{

    static int counter = 0;

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){

            try{
                //System.out.println("\nBefore thread sleep -> " + i);
                Thread.sleep(1000);
                counter++;
                //System.out.println("After thread sleep -> " + i);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 10){
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
}