package org.OOO.Extend.ExtendTask;

import java.util.ArrayList;

public class Main {
    static ArrayList<Person> persons = new ArrayList<>();
    public static void main(String[] args) {
        Object obj = new Person("Vardenis", "Pavardenis");
        System.out.println(obj.toString());

        simulate();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).toString());
        }



    }

    public static void simulate(){
        persons.add(new Person(
                "Vytenis",
                "Petrauskas"
                )
        );
        persons.add(new Person(
                        "Aurimas",
                        "Petkus"
                )
        );
        persons.add(new Person(
                        "Olegas",
                        "Zukas"
                )
        );
    }


}
