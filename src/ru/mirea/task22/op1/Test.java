package ru.mirea.task22.op1;

public class Test {
    public static void main(String[] args) {
        Factory chairFactory = new Factory();
        Chair chair = chairFactory.createChair(Chairs.GAMING);
        Client client = new Client();
        client.Sit(chair);
    }
}
