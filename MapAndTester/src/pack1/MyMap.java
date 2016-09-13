package pack1;

import java.util.ArrayList;

/**
 * Created on 9/13/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project MapAndTester
 */

public class MyMap<K, V> implements MapInterface<K, V> {
    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public SetInterface<MapEnt<K, V>> entrySet() {
        return null;
    }

    @Override
    public V get(K o) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public SetInterface<K> keySet() {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public ArrayList<V> values() {
        return null;
    }
}
