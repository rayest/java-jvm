package mobi.rayson.map;

import mobi.rayson.support.Note;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HashMapTest {

    @Test
    @Note("这种并发map，所有的操作都会锁住整个 map 集合，性能差")
    public void test_synchronizedMap() {
        Map<String, Object> map = Collections.synchronizedMap(new HashMap<>());
        assertNotNull(map);
    }

    @Note("所有的操作都会锁住整个集合，性能差")
    @Test(expected = NullPointerException.class)
    public void test_hashTable_key_can_not_be_null() throws Exception {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put(null, "lee");
    }

    @Test(expected = NullPointerException.class)
    public void test_hashTable_value_can_not_be_null() throws Exception {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("name", null);
    }

    @Test
    @Note("HashMap key 和 value 都可以为空")
    public void test_hashMap_kay_and_value_can_be_null() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, null);
        assertEquals(1, hashMap.size());
    }

    @Test(expected = NullPointerException.class)
    public void test_ConcurrentHashMap_kay_and_value_can_not_be_null() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put(null, null);
    }

    @Note("java.util.包下的集合都是 fail fast的. 通过底层的属性字段 modCount 判断集合结构是否在遍历时被修改了")
    @Test(expected = java.util.ConcurrentModificationException.class)
    public void test_fail_fast() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("name", "lee");
        hashtable.put("age", "20");
        hashtable.put("city", "shanghai");
        Set<String> keySet = hashtable.keySet();
        for (String key : keySet) {
            keySet.remove(key);
        }
    }
}
