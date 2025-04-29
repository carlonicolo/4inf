package Lab1INF52;

public class Main {
    public static void main(String[] args) {
        Animal pippo = new Animal("Pippo",5);
        //System.out.println("Ciao " + pippo.getName());
        System.out.println(pippo);
        pippo.setHasLegs(false);
        System.out.println(pippo);

        Animal pluto = new Animal("Pluto",7);

        if(pippo.getAge() > pluto.getAge()){
            System.out.println("Pippo is older than Pluto");
        } else if(pippo.getAge() < pluto.getAge()){
            System.out.println("Pippo is younger than Pluto");
        } else {
            System.out.println("Pippo and to Pluto have the same age");
        }
    }
}
