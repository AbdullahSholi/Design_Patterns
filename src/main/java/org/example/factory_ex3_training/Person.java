package org.example.factory_ex3_training;

public class Person {
    private int id;
    private String name;

    private Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static Person create(int id, String name) {
        return new Person(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main( String[] args ){
        Person person = new PersonFactory().createPerson("Ahmed");
    }

}

class PersonFactory {
    private int index = 0;

    public Person createPerson(String name) {

        Person person = Person.create(index, name);
        index++;
        return person;
    }
}
