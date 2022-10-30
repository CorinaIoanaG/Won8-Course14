import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDTestFC {

    @Test
    public void methodReturnsADouble() {
        // given
        Conversion conversion = new Conversion();

        // when then
        Double result = conversion.fahrenheitToCelsius(0);
    }

    @Test
    public void methodReturnsARunTimeException1() {
        // given
        Conversion conversion = new Conversion();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            double result = conversion.fahrenheitToCelsius(-10200);
        });
    }

    @Test
    public void methodReturnsARunTimeException2() {
        // given
        Conversion conversion = new Conversion();

        // when then
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            double result = conversion.fahrenheitToCelsius(10500);
        });
    }

    @Test
    public void methodForValue100() {
        // given
        Conversion conversion = new Conversion();

        // when
        Double result = conversion.fahrenheitToCelsius(100);

        // then
        Assertions.assertEquals(37.77777777777778, result);
    }

    @Test
    public void methodForValueMinus10() {
        // given
        Conversion conversion = new Conversion();

        // when
        Double result = conversion.fahrenheitToCelsius(-10);

        // then
        Assertions.assertEquals(-23.333333333333332, result);
    }

}
