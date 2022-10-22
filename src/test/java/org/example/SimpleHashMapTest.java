package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Optional;

/**
 * Unit test for simple SimpleHashMap.
 */
public class SimpleHashMapTest extends TestCase {

    public void testSize() {
        SimpleHashMap<Integer, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put(2, 2);
        map.put(4, 5);
        Assert.assertEquals(2, map.size());
    }

    public void testIsEmpty() {
        SimpleHashMap<Integer, Integer> map = new SimpleHashMap<>("avc", 1000);
        Assert.assertTrue(map.isEmpty());
        map.put(6, 7);
        Assert.assertFalse(map.isEmpty());

    }

    public void testContainsKey() {
        SimpleHashMap<Integer, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put(2, 2);
        map.put(4, 5);
        Assert.assertTrue(map.containsKey(2));
        Assert.assertFalse(map.containsKey(6));

    }

    public void testContainsValue() {
        SimpleHashMap<Integer, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put(3, 2);
        map.put(4, 5);
        Assert.assertTrue(map.containsValue(5));
        Assert.assertFalse(map.containsValue(8));
    }

    public void testGet() {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put("Animal", 8);
        map.put("Human", 10);
        map.put("God", 15);
        Assert.assertEquals(Optional.of(15), Optional.ofNullable(map.get("God")));

    }

    public void testPut() {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put("First", 96);
        map.put("Second", 500);
        map.put("Third", 2222);
        Assert.assertEquals(3, map.size());
    }

    public void testRemove() {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>("avc", 1000);
        map.put("Apple", 8);
        map.put("Banana", 10);
        map.put("Lemon", 15);
        Assert.assertEquals(3, map.size());
        map.remove("Lemon");
        Assert.assertEquals(2, map.size());

    }

    public void testApp()
    {
        assertTrue( true );
    }
}
