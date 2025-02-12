package net.teufel.persons.management;


import com.google.inject.Inject;
import net.teufel.persons.storing.PersonRepository;

public class PersonManager {

    PersonRepository personRepository;

    @Inject
    public PersonManager(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public long countChildren() throws Exception {
        return personRepository.getPersons().stream().filter(person -> person.getAge() < 18).count();
    }

    public long countAdults() throws Exception {
        return personRepository.getPersons().stream().filter(person -> person.getAge() >= 18).count();
    }



}
