package mobi.rayson.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void test_new_instance() throws Exception {
        Class<?> clazz = Class.forName("mobi.rayson.reflection.User");
        User user = (User) clazz.newInstance();
        assertEquals("lee", user.getName("lee"));
    }

    @Test
    public void test_get_field() throws Exception {
        Class<?> clazz = Class.forName("mobi.rayson.reflection.User");
        Field nameField = clazz.getDeclaredField("defaultName");

        User user = (User) clazz.newInstance();
        String name = (String) nameField.get(user);
        assertEquals("lee", name);
    }

    @Test
    public void test_method_invoke() throws Exception {
        Class<?> clazz = Class.forName("mobi.rayson.reflection.User");
        Constructor<?> constructor = clazz.getConstructor();
        Object newInstance = constructor.newInstance();

        Method method = clazz.getMethod("getName", String.class);
        String name = (String) method.invoke(newInstance, "ray");
        assertEquals("ray", name);
    }
}
