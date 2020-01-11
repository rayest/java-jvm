package mobi.rayson.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    private LinkedList<String> list;

    @Before
    public void setUp()   {
        list = new LinkedList<>();
        list.add("0");
        list.add("1");
    }

    @Test
    public void test_get() {
        assertEquals("0", list.get(0));
    }

    @Test
    public void test_add() {
        list.add("2");
        assertEquals("2", list.get(2));
    }

    @Test
    public void test_contains() {
        assertTrue(list.contains("0"));
    }

    @Test
    public void test_addFirst() {
        list.addFirst("-1");
        assertEquals("-1", list.get(0));
        assertEquals("0", list.get(1));
    }
}
