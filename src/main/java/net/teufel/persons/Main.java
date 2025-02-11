package net.teufel.persons;

import net.teufel.persons.domain.PersonDisplayCommand;

public class Main {
    public static void main(String[] args) throws Exception {

        PersonDisplayCommand personDisplayCommand = new PersonDisplayCommand();
        personDisplayCommand.displayAdults();
        personDisplayCommand.displayChildren();

    }
}