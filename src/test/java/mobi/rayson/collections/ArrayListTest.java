package mobi.rayson.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {
    private List<String> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("0");
        list.add("1");
    }

    @Test
    public void test_size() {
        assertEquals(2, list.size());
    }

    @Test
    public void test_contains() {
        assertTrue(list.contains("0"));
    }

    @Test
    public void test_get() {
        assertEquals("0", list.get(0));
    }

    @Test
    public void test_() {
        assertEquals(0, list.indexOf("0"));
    }

    @Test
    public void test_iterator() {
        Iterator<String> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()){
            iterator.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void test_remove() {
        list.remove("0");
        assertFalse(list.contains("0"));
    }
}
