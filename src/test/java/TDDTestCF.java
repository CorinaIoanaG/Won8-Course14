import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDTestCF {
    @Test
    public void methodReturnsADouble() {
        // given
        Conversion conversion = new Conversion();

        // when then
        Double result = conversion.celsiusToFahrenheit(0);
    }

    @Test
    public void methodReturnsARunTimeException1() {
        // given
        Conversion conversion = new Conversion();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            double result = conversion.celsiusToFahrenheit(-5700);
        });
    }

    @Test
    public void methodReturnsARunTimeException2() {
        // given
        Conversion conversion = new Conversion();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            double result = conversion.celsiusToFahrenheit(5700);
        });
    }

    @Test
    public void methodForValue10() {
        // given
        Conversion conversion = new Conversion();

        // when
        Double result = conversion.celsiusToFahrenheit(10);

        // then
        Assertions.assertEquals(50.0, result);
    }

    @Test
    public void methodForValueMinus10() {
        // given
        Conversion conversion = new Conversion();

        // when
        Double result = conversion.celsiusToFahrenheit(-10);

        // then
        Assertions.assertEquals(14.0, result);
    }

}
