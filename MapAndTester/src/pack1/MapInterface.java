package pack1;

import java.util.ArrayList;

public interface MapInterface<K, V> {
    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    SetInterface<MapEnt<K, V>> entrySet();

    V get(K o);

    boolean isEmpty();

    SetInterface<K> keySet();

    V put(K key, V value);

    int size();

    V remove(K key);

    ArrayList<V> values();
}