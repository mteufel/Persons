package net.teufel.persons.client;


public class PersonDisplayCommand {

    PersonRepository personRepository;

    public PersonDisplayCommand() {
        this.personRepository = new PersonRepository();
    }

    public void displayAdults() throws Exception {
        System.out.println("!!Erwachsene: " + personRepository.getAdults());
    }

    public void displayChildren() throws Exception {
        System.out.println("!!Kinder: " + personRepository.getChildren());
    }

}
