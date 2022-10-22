package org.example;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface HashMap<K, V> extends Map<K, V> {

   @Override
    default int size() { return 0; }

    @Override
    default boolean isEmpty() { return true; }

    @Override
    default boolean containsKey(Object key) { return true; }

    @Override
    default boolean containsValue(Object value) { return true; }

    @Override
    default V get(Object key) { return null; }

    @Override
    default V put(K key, V value) { return null; }

    @Override
    default V remove(Object key) { return null; }

    @Override
    default void putAll(Map<? extends K, ? extends V> m) { }

    @Override
    default void clear() { }

    @Override
    default Set<K> keySet() { return null; }

    @Override
    default Collection<V> values() { return null; }

    @Override
    default Set<Entry<K, V>> entrySet() { return null; }

}

