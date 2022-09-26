package Animal;

public class Dog extends Animal {
    String name="Собака";
    String noise="Гав-Гав";
String food="Косточку";
    public void makeNoise() {
        System.out.println(name+" издает звук "+ noise);
    }

    @Override
    public void eat() {
        System.out.println(name+" ест "+ food);
    }

    @Override
    public void sleep() {
        System.out.println(name+" спит");
    }
}
