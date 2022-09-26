package Animal;

public class Cat extends Animal {
    String name="Кот";
    String noise="Мяу-Мяу";
    String food="Молоко";
    @Override
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
