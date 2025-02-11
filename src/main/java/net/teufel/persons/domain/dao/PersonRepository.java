package net.teufel.persons.domain.dao;


public class PersonRepository {


    private PersonsReader personsReader;

    public PersonRepository() {
        personsReader = new PersonsReader("persons.csv");
    }

    public long getChildren() throws Exception {
        return personsReader.read().stream().filter(person -> person.getAge() < 18).count();
    }

    public long getAdults() throws Exception {
        return personsReader.read().stream().filter(person -> person.getAge() >= 18).count();
    }

}
