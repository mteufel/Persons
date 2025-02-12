package net.teufel.persons.client;

import net.teufel.persons.management.PersonManager;

public class PersonDisplayCommand {

    PersonManager personManager;

    public PersonDisplayCommand() {
        this.personManager = new PersonManager();
    }

    public void displayAdults() throws Exception {
        System.out.println("Erwachsene: " + personManager.countAdults());
    }

    public void displayChildren() throws Exception {
        System.out.println("Kinder: " + personManager.countChildren());
    }

}
