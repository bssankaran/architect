import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Value;

public class ValueTest {
    @Test
    public void should_return_true_when_1cm_is_same_as_another_1_cm() {
        Value value1 = new Value(1);
        Value value2 = new Value(1);

        boolean result = value1.same(value2);

        assertEquals(true, result);
    }

    @Test
    public void should_return_true_when_1cm_is_equal_to_1cm() {
        Value value1 = new Value(1);
        Value value2 = new Value(1);

        boolean result = value1.equals(value2);

        assertEquals(true, result);
    }

    @Test
    public void should_return_false_when_1cm_not_equal_to_2_cm() {
        Value value1 = new Value(1);
        Value value2 = new Value(2);

        boolean result = value1.equals(value2);

        assertEquals(false, result);
    }
}
