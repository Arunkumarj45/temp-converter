import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void testConvert() {
        TemperatureConverter tc = new TemperatureConverter();
        // Test case: 0°C should be 32°F
        assertEquals(32.0, tc.convert(0), 0.001);
        // Test case: 100°C should be 212°F
        assertEquals(212.0, tc.convert(100), 0.001);
    }
}