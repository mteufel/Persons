package net.teufel.persons.client.persons.domain;

public class Person {

    private Long id;
    private String Name;
    private Integer age;

    public Person(Long id, String name, Integer age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.id + " " + this.Name + " " + this.age;
    }
}
