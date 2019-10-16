package be.verbinnen.maxime;

import com.google.common.collect.Lists;

import java.util.List;

public class MyApi {
    public static void main(String[] args) {
        Person maxime = new Person("Maxime");
        Person tom = new Person("Tom");

        List<Person> persons = Lists.newArrayList();
        persons.add(maxime);
        persons.add(tom);

        for (Person person : persons) {
            System.out.println(person.getFirstName());
        }
    }
}
