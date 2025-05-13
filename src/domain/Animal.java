package domain;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void sleep() {
        System.out.println(name + " спить.");
    }

    public void makeSound() {
        System.out.println(name + " видає звук.");
    }

    public void move() {
        System.out.println(name + " рухається.");
    }
}

