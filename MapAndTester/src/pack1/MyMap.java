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
    private ArrayList<MapEnt<K, V>> internalMap;

    public MyMap() {
        this.internalMap = new ArrayList<>();
    }

    @Override
    public void clear() {
        internalMap.clear();
    }

    @Override
    public boolean containsKey(K key) {
        boolean contains = false;
        for (int i = 0; i < internalMap.size(); i++) {
            contains = (internalMap.get(i).getKey() == key);
        }
        return contains;
    }

    @Override
    public boolean containsValue(V value) {
        boolean contains = false;
        for (int i = 0; i < internalMap.size(); i++) {
            contains = (internalMap.get(i).getValue() == value);
        }
        return contains;
    }

    @Override
    public SetInterface<MapEnt<K, V>> entrySet() {
        return null;  //todo ?
    }

    @Override
    public V get(K o) {
        return findValueFromKey(o);
    }

    @Override
    public boolean isEmpty() {
        return internalMap.isEmpty();
    }

    @Override
    public SetInterface<K> keySet() {
        return null; //todo help
    }

    @Override
    public V put(K key, V value) {
        V oldValue;
        if (findIndexFromKey(key) == -1) { //if key not found
            internalMap.add(new MapEnt<>(key, value));
            return null;
        } else { //key found
            oldValue = internalMap.get(findIndexFromKey(key)).getValue();
            internalMap.get(findIndexFromKey(key)).setValue(value);
            return oldValue;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V remove(K key) {
        V oldvalue;
        if (findValueFromKey(key) == null)
            return null; //if key not found
        else {
            oldvalue = internalMap.remove(findIndexFromKey(key)).getValue();
        }

        return oldvalue;
    }

    @Override
    public ArrayList<V> values() {
        return null;
    }

    /**
     * Finds the index a key is at.
     *
     * @param key Key to search for.
     * @return int index
     */
    public int findIndexFromKey(K key) {
        for (int i = 0; i < internalMap.size(); i++) {
            if (internalMap.get(i).getKey() == key) return i;
        }
        return -1;
    }

    /**
     * Finds the value in the arraylist from a key.
     *
     * @param key key to look for
     * @return V value found.
     */
    public V findValueFromKey(K key) {
        for (int i = 0; i < internalMap.size(); i++) {
            if (internalMap.get(i).getKey() == key) return internalMap.get(i).getValue();
        }
        return null;
    }
}
