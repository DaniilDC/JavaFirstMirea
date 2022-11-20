package ru.mirea.task27.op2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class City{
    String city;
    String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}


public class Test {
    public static void main(String[] args)
    {
        City[] cities = {
                new City("Москва", "Россия"),
                new City("Душанбе", "Таджикистан"),
                new City("Киев", "Украина"),
                new City("Токио", "Япония"),
                new City("Вашингтон", "США"),
                new City("Эдинбурнг", "Велкобритания"),
                new City("Алма-Ата", "Казахстан"),
                new City("Махачкала", "Россия"),
        };
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (City city : cities) {
            if (map.containsKey(city.country)) {
                map.get(city.country).add(city.city);
            }
            else {
                map.put(city.country, new ArrayList<>());
                map.get(city.country).add(city.city);
            }
        }
        System.out.println(map);
    }
}
