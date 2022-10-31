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

    public Person removePerson(int id) {
        Person person = null;
        boolean found = false;
        if (allPersons.size() != 0) {
            for (Person item : allPersons) {
                if (item.getId() == id) {
                    person = item;
                    found = true;
                    allPersons.remove(item);
                    break;
                }
            }
        }
        if (!found) {
            throw new RuntimeException("Invalid id.");
        }
        return person;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> result = new ArrayList<>();
        if (allPersons.size() != 0 && age > 0 && age < 120) {
            for (Person item : allPersons) {
                if (item.getAge() > age) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        if (allPersons.size() != 0) {
            for (Person item : allPersons) {
                result.add(item.getName());
            }
        }
        return result;
    }

    public Person getPerson(String name) {
        Person person = null;
        if (allPersons.size() != 0 && !name.equals(null)) {
            for (Person item : allPersons) {
                if (item.getName().equals(name)) {
                    person = item;
                    break;
                }
            }
        }
        return person;
    }

    public Person getPersonById(int id) {
        Person person = null;
        if (allPersons.size() != 0 && id > 0) {
            for (Person item : allPersons) {
                if (item.getId() == id) {
                    person = item;
                    break;
                }
            }
        }
        return person;
    }

}
