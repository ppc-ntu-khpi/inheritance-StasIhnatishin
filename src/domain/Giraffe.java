package domain;

public class Giraffe extends Animal {

    public Giraffe(String name, int age) {
        super(name, age);
    }

    public void reachHighLeaves() {
        System.out.println(name + " тягнеться до високого листя.");
    }

    public void stretchNeck() {
        System.out.println(name + " витягує шию.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " муркоче тихо (жирафи зазвичай мовчазні).");
    }
}
