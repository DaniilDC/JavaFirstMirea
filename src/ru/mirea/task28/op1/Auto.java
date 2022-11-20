package ru.mirea.task28.op1;

public class Auto {
    public String brand, model, type;
    private final Wheels wheels = new Wheels("Michelin");

    public Auto() { }

    Auto(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Auto(String brand, String model, String type){
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("рррр");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        @Override
        public String toString() {
            return "Wheels{" + "manufacturer='" + manufacturer + '\'' + '}';
        }
    }

    public static class Sedan extends Auto { //Вложенный статический класс
        Sedan(String brand, String model) {
            super(brand, model);
            setType("Sedan");
        }
    }

    public class Sportcar extends Auto { //Вложенный класс

        Sportcar(String brand, String model) {
            super(brand, model);
            setType("F1 car");
        }

        public void engineSound(){
            System.out.println("РРРРРРР");
        }
    }

    public static void main(String[] args) {

        Auto sedan=new Sedan("Mercedes", "S450");
        Auto notAnonF1Car=new Auto().new Sportcar("Lamborghini", "Huracan Perfomante");
        Auto anonF1Car=new Auto("BMW", "M5 F90", "Sportcar") {
            @Override
            public void engineSound() {
                System.out.println("РРРРРРР");
            }
        };

        System.out.println(sedan.toString());
        sedan.engineSound();

        System.out.println(anonF1Car.toString());
        anonF1Car.engineSound();

        System.out.println(notAnonF1Car.toString());
        notAnonF1Car.engineSound();

    }


    @Override
    public String toString() {
        return "Auto{" + "brand='" + brand + '\'' + ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}