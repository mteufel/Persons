package net.teufel.persons.storing;

import net.teufel.persons.domain.Person;
import net.teufel.files.FileReader;
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
