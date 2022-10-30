import lombok.Getter;
import lombok.Setter;

@Getter

public class Person {
    private String name;
    private int age;
    @Setter
    private int id;

    public Person(String name, int age) {
        if (!name.equals(null) && (age > 0 && age < 120)) {
            this.name = name;
            this.age = age;
            this.id = 0;
        } else {
            throw new RuntimeException("Invalid parameters.");
        }
    }
}
