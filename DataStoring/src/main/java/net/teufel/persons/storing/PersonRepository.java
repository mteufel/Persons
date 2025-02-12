package net.teufel.persons.storing;

import java.util.List;
import net.teufel.persons.domain.Person;

public class PersonRepository {

    private PersonsReader personsReader;

    public PersonRepository() {
        personsReader = new PersonsReader("persons.csv");
    }

    public List<Person> getPersons() throws Exception {
        return personsReader.read();
    }

    // Warum nicht gleich hier ?
    //
    //public List<Person> getChildren() throws Exception {
    //    return personsReader.read().stream().filter(person -> person.getAge() < 18).count();
    //}

    //public List<Person> getAdults() throws Exception {
    //    return personsReader.read().stream().filter(person -> person.getAge() >= 18).count();
    //}

}
