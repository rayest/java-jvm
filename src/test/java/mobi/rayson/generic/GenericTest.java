package mobi.rayson.generic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenericTest {

    public <T> String generic_method(T... input) {
        for (T element : input) {
            if (element instanceof Integer) {
                return "integer";
            }
            if (element instanceof String) {
                return "string";
            }
        }
        return null;

    }

    @Test
    public void test_generic_method() {
        String s1 = generic_method(1);
        assertEquals("integer", s1);

        String s2 = generic_method("1");
        assertEquals("string", s2);
    }
}
