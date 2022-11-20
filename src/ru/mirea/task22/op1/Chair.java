package ru.mirea.task22.op1;

public interface Chair {
    String getName();
}
class Gaming_chair implements Chair {
    @Override
    public String getName() {
        return "игровой стул";
    }
}

class Average_chair implements Chair {
    @Override
    public String getName() {
        return "обычный стул";
    }
}
class Broken_chair implements Chair{
    @Override
    public String getName() {
        return "сломанный стул";
    }
}

enum Chairs { GAMING, AVERAGE,BROKEN }
