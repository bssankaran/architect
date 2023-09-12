import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.tw.bootcamp.Length;

public class LengthTest {
    @Test
    public void should_return_true_when_1cm_is_same_as_another_1_cm() {
        Length length1 = Length.ofCentimeter(1);

        boolean result = length1.same(length1);

        assertEquals(true, result);
    }

    @Test
    public void should_return_true_when_1cm_is_equal_to_1cm() {
        Length length1 = Length.ofCentimeter(1);
        Length length2 = Length.ofCentimeter(1);

        boolean result = length1.equals(length2);

        assertEquals(true, result);
    }

    @Test
    public void should_return_false_when_1cm_is_not_same_as_another_1cm() {
        Length length1 = Length.ofCentimeter(1);
        Length length2 = Length.ofCentimeter(1);

        boolean result = length1.same(length2);

        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when_1cm_not_equal_to_2_cm() {
        Length length1 = Length.ofCentimeter(1);
        Length length2 = Length.ofCentimeter(2);

        boolean result = length1.equals(length2);

        assertEquals(false, result);
    }

    @Test
    void should_return_true_when_comparing_1_meter_and_100_cm(){
        Length length1 = Length.ofMeter(1);
        Length length2 = Length.ofCentimeter(100);

        boolean result = length1.equals(length2);

        assertEquals(true, result);
    }

    @Test
    void should_return_true_when_comparing_100_cm_and_1_meter(){
        Length length1 = Length.ofCentimeter(100);
        Length length2 = Length.ofMeter(1);

        boolean result = length1.equals(length2);

        assertEquals(true, result);
    }

    @Test
    void should_return_false_when_comparing_50_cm_and_1_meter(){
        Length length1 = Length.ofCentimeter(50);
        Length length2 = Length.ofMeter(1);

        boolean result = length1.equals(length2);

        assertEquals(false, result);
    }
}
