package mobi.rayson.list;

import mobi.rayson.support.Note;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    @Note("new 出来的 list，在 add 前默认容量和size为0")
    public void test_elementData_length_is_0_before_add() throws Exception {
        ArrayList<String> list = new ArrayList<>();

        Class<?> clazz = Class.forName("java.util.ArrayList");
        Field field = clazz.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);

        assertEquals(0, elementData.length);
    }

    @Test
    @Note("add 时才初始化底层数组的容量值，默认为10")
    public void test_elementData_length_is_10_after_add() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");

        Class<?> clazz = Class.forName("java.util.ArrayList");
        Field field = clazz.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);

        assertEquals(10, elementData.length);
    }

    @Test
    @Note("list扩容. 在 add 操作时判断数组已满时需要扩容: newCapacity = oldCapacity + oldCapacity/2")
    public void test_elementData_length_after_inflate() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        Class<?> clazz = Class.forName("java.util.ArrayList");
        Field field = clazz.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);

        assertEquals(15, elementData.length);
    }

    @Test
    @Note("list赋予默认capacity，但是size=0，即数组未初始化。仅仅设置了底层数组的大小")
    public void test_init_capacity() throws Exception {
        ArrayList<String> list = new ArrayList<>(10);
        assertEquals(0, list.size());

        Class<?> clazz = Class.forName("java.util.ArrayList");
        Field field = clazz.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);

        assertEquals(10, elementData.length);

    }
}
