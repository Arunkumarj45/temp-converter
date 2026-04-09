import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    public void testConvert() {
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(32.0, tc.convert(0), 0.001); // 0 Celsius = 32 Fahrenheit
        assertEquals(212.0, tc.convert(100), 0.001); // 100 Celsius = 212 Fahrenheit
    }
}