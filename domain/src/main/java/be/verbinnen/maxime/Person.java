package be.verbinnen.maxime;

public class Person {

    private final String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "be.verbinnen.maxime.Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
