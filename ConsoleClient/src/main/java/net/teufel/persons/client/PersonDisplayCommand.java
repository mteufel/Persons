package net.teufel.persons.client;

import com.google.inject.Inject;
import net.teufel.persons.management.PersonManager;

public class PersonDisplayCommand {

    PersonManager personManager;

    @Inject
    public PersonDisplayCommand(PersonManager personManager) {
        this.personManager = personManager;
    }

    public void displayAdults() throws Exception {
        System.out.println("Erwachsene: " + personManager.countAdults());
    }

    public void displayChildren() throws Exception {
        System.out.println("Kinder: " + personManager.countChildren());
    }

}
