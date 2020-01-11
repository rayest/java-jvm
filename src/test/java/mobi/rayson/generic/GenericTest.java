package mobi.rayson.generic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenericTest {

    @Test
    public void test_generic_method() {

        GenericMethod genericMethod = new GenericMethod();

        String s1 = genericMethod.generic_method(1);
        assertEquals("integer", s1);

        String s2 = genericMethod.generic_method("1");
        assertEquals("string", s2);
    }

    @Test
    public void test_generic_class() {
        CustomerList<String> colorList = new CustomerList<>();
        colorList.add("red");
        assertEquals("red", colorList.get());

        CustomerList<Integer> numberList = new CustomerList<>();
        numberList.add(1);
        assertEquals(1, (int)numberList.get());
    }
}
