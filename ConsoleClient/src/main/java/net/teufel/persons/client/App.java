package net.teufel.persons.client;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.teufel.persons.client.di.AppInjector;

public class App {

    public static void main(String[] args) throws Exception {

        Injector injector = Guice.createInjector(new AppInjector());
        PersonDisplayCommand personDisplayCommand = injector.getInstance(PersonDisplayCommand.class);

        personDisplayCommand.displayAdults();
        personDisplayCommand.displayChildren();
    }

}
