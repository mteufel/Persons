package net.teufel.persons.domain.dao;

import net.teufel.common.FileReader;
import net.teufel.persons.domain.Person;
import net.teufel.persons.domain.PersonParser;

import java.util.ArrayList;
import java.util.List;

public class PersonsReader {

    FileReader fileReader;
    PersonParser personParser;

    public PersonsReader(String fileName) {
        this.fileReader = new FileReader(fileName);
        this.personParser = new PersonParser();
    }

    public List<Person> read() throws Exception {
        List<Person> persons = new ArrayList<>();
        this.fileReader.read().forEach( s -> persons.add( personParser.parseFrom(s)  ));
        return persons;
    }

}
