import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PersonService {
    private List<Person> allPersons = new ArrayList<>();

    public Person addPerson(Person person) {
        int id;
        if (allPersons.size() == 0) {
            allPersons.add(person);
            allPersons.get(0).setId(1);
            return person;
        }
        id = allPersons.get(allPersons.size() - 1).getId();
        do {
            id++;
            if (!allPersons.contains(id)) {
                break;
            }
        } while (!allPersons.contains(id));
        person.setId(id);
        allPersons.add(person);
        return person;
    }

}
