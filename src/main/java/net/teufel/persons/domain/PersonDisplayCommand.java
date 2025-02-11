package net.teufel.persons.domain;

import net.teufel.persons.domain.dao.PersonRepository;

public class PersonDisplayCommand {

    PersonRepository personRepository;

    public PersonDisplayCommand() {
        this.personRepository = new PersonRepository();
    }

    public void displayAdults() throws Exception {
        System.out.println("Erwachsene: " + personRepository.getAdults());
    }

    public void displayChildren() throws Exception {
        System.out.println("Kinder: " + personRepository.getChildren());
    }

}
