package net.teufel.persons.storing;

import com.google.inject.Inject;
import net.teufel.persons.domain.Person;
import net.teufel.files.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PersonsReader {

    FileReader fileReader;
    PersonParser personParser;

    @Inject
    public PersonsReader(FileReader fileReader, PersonParser personParser) {
        this.fileReader = fileReader;
        this.fileReader.setFilename("persons.csv");
        this.personParser = personParser;

    }

    public List<Person> read() throws Exception {
        List<Person> persons = new ArrayList<>();
        this.fileReader.read().forEach( s -> persons.add( personParser.parseFrom(s)  ));
        return persons;
    }

}
