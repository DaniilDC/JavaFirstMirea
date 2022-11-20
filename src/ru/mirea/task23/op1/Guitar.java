package ru.mirea.task23.op1;

import java.util.Objects;

public class Guitar {

    public String brand;
    public String type;
    public int price;

    Guitar(String brand, int price, String type)
    {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar that = (Guitar) o;
        if (brand != that.brand) return false;
        if (price != that.price) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(brand, type, price);
    }

    @Override
    public String toString()
    {
        return "Guitar: brand - " + brand + " type - " + type + " price - " + price
                + " hash - " + hashCode();
    }
}

class LesPaul extends Guitar
{
    LesPaul(String brand, int price, String type) {
        super(brand, price, type);
    }
}

class ESP extends Guitar
{
    ESP(String brand, int price, String type) {
        super(brand, price, type);
    }
}

class Telecaster extends Guitar
{
    Telecaster(String brand, int price, String type) {
        super(brand, price, type);
    }
}