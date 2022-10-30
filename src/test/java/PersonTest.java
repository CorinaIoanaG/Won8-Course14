import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void invalidName(){
        // given when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            Person person = new Person(null, 15);
        });
    }

    @Test
    public void invalidAge1(){
        // given when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            Person person = new Person("Florin", -9);
        });
    }

    @Test
    public void invalidAge2(){
        // given when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            Person person = new Person("Florin", 130);
        });
    }

}
