public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.addPerson(new Person("Florin", 30));
        personService.addPerson(new Person("Anca", 45));
        personService.addPerson(new Person("Ioana", 33));
        System.out.println(personService.getAllPersons().get(2).getId());
    }
}
