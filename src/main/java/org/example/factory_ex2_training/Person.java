package org.example.factory_ex2_training;

public class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public static void main( String[] args ){
        PersonFactory person = new PersonFactory();
        Person p1 = person.createPerson("Ali");
        Person p2 = person.createPerson("Ali1");
        Person p3 = person.createPerson("Ali2");

        System.out.println(p1.getId());
        System.out.println(p1.getName());

        System.out.println(p2.getId());
        System.out.println(p2.getName());

        System.out.println(p3.getId());
        System.out.println(p3.getName());

    }

}

class PersonFactory {
    private int index = 0;

    public Person createPerson(String name) {
        Person person = new Person(index, name);
        index++;
        return person;
    }


}

