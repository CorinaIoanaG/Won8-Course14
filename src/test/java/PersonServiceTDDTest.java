import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonServiceTDDTest {
    
    @Test
    public void addPersonReturnType() {
        // given
        PersonService personService = new PersonService();

        // when then
        Person person = personService.addPerson(new Person("Silviu", 38));
    }

    @Test
    public void addPersonValue() {
        // given
        PersonService personService = new PersonService();

        // when
        Person person = personService.addPerson(new Person("Anca", 50));

        //then
        Assertions.assertEquals(person.getName(),"Anca");
        Assertions.assertEquals(person.getAge(),50);
        Assertions.assertEquals(person.getId(),1);
    }

}
