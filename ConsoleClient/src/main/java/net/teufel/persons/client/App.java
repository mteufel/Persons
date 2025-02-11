package net.teufel.persons.client;

public class App {

    public static void main(String[] args) throws Exception {
        PersonDisplayCommand personDisplayCommand = new PersonDisplayCommand();
        personDisplayCommand.displayAdults();
        personDisplayCommand.displayChildren();
    }

}
