package oop.lsp;

public class Sparrow implements Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow flies!");
    }

    @Override
    public void move() {
        System.out.println("Sparrow hops!");
    }
}
