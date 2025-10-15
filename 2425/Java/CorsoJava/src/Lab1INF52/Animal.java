package Lab1INF52;

public class Animal {
    private String name;
    private int age;
    private boolean hasLegs;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.hasLegs = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasLegs=" + hasLegs +
                '}';
    }
}
