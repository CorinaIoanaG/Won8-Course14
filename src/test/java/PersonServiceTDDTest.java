import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonServiceTDDTest {

    @Test
    public void addPersonReturnType() {
        // given
        PersonService personService = new PersonService();

        // when then
        Person person = personService.addPerson(new Person("Silviu", 38));
    }

    @Test
    public void addPersonValid() {
        // given
        PersonService personService = new PersonService();

        // when
        Person person = personService.addPerson(new Person("Anca", 50));

        //then
        Assertions.assertEquals(person.getName(), "Anca");
        Assertions.assertEquals(person.getAge(), 50);
        Assertions.assertEquals(person.getId(), 1);
    }

    @Test
    public void addPersonInvalidAge() {
        // given
        PersonService personService = new PersonService();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            Person person = personService.addPerson(new Person("Florin", -9));
        });
    }

    @Test
    public void removePersonReturnType() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));

        // when then
        Person person = personService.removePerson(1);
    }

    @Test
    public void removePersonValid() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));

        // when
        Person person = personService.removePerson(1);

        //then
        Assertions.assertEquals(person.getName(), "Florin");
        Assertions.assertEquals(person.getAge(), 30);
        Assertions.assertEquals(person.getId(), 1);
    }

    @Test
    public void removePersonInvalidId() {
        // given
        PersonService personService = new PersonService();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            Person person = personService.removePerson(-5);
        });
    }

    @Test
    public void getPersonOlderType() {
        // given
        PersonService personService = new PersonService();

        // when then
        List<Person> persons = personService.getPersonsOlderThan(30);
    }

    @Test
    public void getPersonOlderInvalidAge1() {
        // given
        PersonService personService = new PersonService();

        // when
        List<Person> persons = personService.getPersonsOlderThan(-9);

        //then
        Assertions.assertEquals(persons.size(), 0);
    }

    @Test
    public void getPersonOlderInvalidAge2() {
        // given
        PersonService personService = new PersonService();

        // when
        List<Person> persons = personService.getPersonsOlderThan(130);

        //then
        Assertions.assertEquals(persons.size(), 0);
    }

    @Test
    public void getPersonOlderSize0() {
        // given
        PersonService personService = new PersonService();

        // when
        List<Person> persons = personService.getPersonsOlderThan(30);

        //then
        Assertions.assertEquals(persons.size(), 0);
    }

    @Test
    public void getPersonOlderValid() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));

        // when
        List<Person> persons = personService.getPersonsOlderThan(40);

        //then
        Assertions.assertEquals(persons.size(), 1);
        Assertions.assertEquals(persons.get(0).getId(), 2);
        Assertions.assertEquals(persons.get(0).getName(), "Anca");
        Assertions.assertEquals(persons.get(0).getAge(), 45);
    }

    @Test
    public void getPersonsNamesReturnType() {
        // given
        PersonService personService = new PersonService();

        // when then
        List<String> persons = personService.getAllPersonNames();
    }

    @Test
    public void getPersonsNamesValid() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));

        // when
        List<String> persons = personService.getAllPersonNames();

        //then
        Assertions.assertEquals(persons.size(), 2);
        Assertions.assertEquals(persons.get(0), "Florin");
        Assertions.assertEquals(persons.get(1), "Anca");
    }

    @Test
    public void getPersonsNamesSize0() {
        // given
        PersonService personService = new PersonService();

        // when
        List<String> persons = personService.getAllPersonNames();

        //then
        Assertions.assertEquals(persons.size(), 0);
    }

    @Test
    public void getPersonReturnType() {
        // given
        PersonService personService = new PersonService();

        // when then
        Person person = personService.getPerson("a");
    }

    @Test
    public void getPersonNullName() {
        // given
        PersonService personService = new PersonService();

        // when
        Person person = personService.getPerson(null);

        //then
        Assertions.assertEquals(person, null);
    }

    @Test
    public void getPersonValid() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));

        // when
        Person person = personService.getPerson("Anca");

        //then
        Assertions.assertEquals(person.getId(), 2);
        Assertions.assertEquals(person.getName(), "Anca");
        Assertions.assertEquals(person.getAge(), 45);
    }

    @Test
    public void getPersonIdType() {
        // given
        PersonService personService = new PersonService();

        // when then
        Person person = personService.getPersonById(1);
    }

    @Test
    public void getPersonIdMinus() {
        // given
        PersonService personService = new PersonService();

        // when
        Person person = personService.getPersonById(-8);

        //then
        Assertions.assertEquals(person, null);
    }

    @Test
    public void getPersonIdValid() {
        // given
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));

        // when
        Person person = personService.getPersonById(2);

        //then
        Assertions.assertEquals(person.getId(), 2);
        Assertions.assertEquals(person.getName(), "Anca");
        Assertions.assertEquals(person.getAge(), 45);
    }

}
