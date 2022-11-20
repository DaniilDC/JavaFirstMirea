package ru.mirea.task27.op1;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args)
    {
        HashMap<String, String> people = new HashMap<>();

        people.put("Ермаченков", "Василий");
        people.put("Шматко", "Юрий");
        people.put("Ермаков", "Андрей");
        people.put("Махмудов", "Амир");
        people.put("Чернышов", "Даниил");
        people.put("Демиденко", "Данила");
        people.put("Паньков", "Данила");
        people.put("Дамарад", "Даниил");
        people.put("Корнеплод", "Виктор");
        people.put("Цветоножка", "Алевтина");

        System.out.println("До коррекции - " + "\n" + people);

        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:people.keySet()){
            String name = people.get(surname);
            for (String surname2:people.keySet()){
                String name2 = people.get(surname2);
                if (name2.equals(name) && !surname.equals(surname2)){
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete){
            people.remove(surname);
        }
        System.out.println("Список после коррекции:\n"+people);
        people.clear();
    }
}
