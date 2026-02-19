package oop.lsp;

public class Eagle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Eagle flies!!!");
    }

    @Override
    public void move() {
        System.out.println("Eagle walks or hops!!!");
    }
}
