package net.teufel.persons.client;

import net.teufel.persons.client.persons.domain.Person;

public class PersonParser {

    public Person parseFrom(String line) {
        String[] values = line.split(";");
        return new Person(Long.parseLong(values[0]),values[1],Integer.parseInt(values[2]));
    }

}
