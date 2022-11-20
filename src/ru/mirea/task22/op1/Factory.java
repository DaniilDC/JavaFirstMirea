package ru.mirea.task22.op1;

public class Factory {
    public Chair createChair(Chairs type){
        Chair chair=null;
        switch (type) {
            case GAMING -> {
                chair = new Gaming_chair();
                break;
            }
            case AVERAGE -> {
                chair = new Average_chair();
                break;
            }
            case BROKEN -> {
                chair = new Broken_chair();
                break;
            }
        }
        return chair;
    }
}
