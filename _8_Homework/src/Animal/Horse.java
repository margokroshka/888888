package Animal;

public class Horse extends Animal {
    String name="Лошадь";
    String noise="Иго-го";
    String eat="Овес";
    @Override
    public void makeNoise() {
        System.out.println(name+" издает звук "+ noise);
    }

    @Override
    public void eat() {
        System.out.println(name+" ест "+eat);
    }

    @Override
    public void sleep() {
        System.out.println(name+" спит");
    }
}
