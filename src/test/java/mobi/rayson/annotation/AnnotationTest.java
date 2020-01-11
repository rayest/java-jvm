package mobi.rayson.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnnotationTest {

    @Test
    public void test_isAnnotationPresent() throws Exception {
        Field providerField = Apple.class.getField("provider");
        assertTrue(providerField.isAnnotationPresent(FruitProvider.class));
    }

    @Test
    public void test_getAnnotation() throws Exception {
        Field providerField = Apple.class.getField("provider");
        FruitProvider fruitProvider = providerField.getAnnotation(FruitProvider.class);
        assertEquals(1, fruitProvider.id());
        assertEquals("红富士", fruitProvider.name());
        assertEquals("陕西西安市", fruitProvider.address());
    }
}
