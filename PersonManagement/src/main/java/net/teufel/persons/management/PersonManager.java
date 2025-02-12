package net.teufel.persons.management;


import net.teufel.persons.storing.PersonRepository;

public class PersonManager {

    PersonRepository personRepository;

    public PersonManager() {
        personRepository = new PersonRepository();
    }

    public long countChildren() throws Exception {
        return personRepository.getPersons().stream().filter(person -> person.getAge() < 18).count();
    }

    public long countAdults() throws Exception {
        return personRepository.getPersons().stream().filter(person -> person.getAge() >= 18).count();
    }



}
