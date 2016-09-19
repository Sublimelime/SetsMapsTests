package pack1;

import java.util.ArrayList;

/**
 * Created on 9/13/2016, 2:29 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project MapAndTester
 */

@SuppressWarnings("Convert2streamapi")
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
        for (MapEnt<K, V> anInternalMap : internalMap) {
            contains = (anInternalMap.getKey().equals(key));
        }
        return contains;
    }

    @Override
    public boolean containsValue(V value) {
        boolean contains = false;
        for (MapEnt<K, V> anInternalMap : internalMap) {
            contains = (anInternalMap.getValue().equals(value));
        }
        return contains;
    }

    @Override
    public MySet<MapEnt<K, V>> entrySet() {
        MySet<MapEnt<K, V>> setOfEntries = new MySet<>();
        for (MapEnt<K, V> anInternalMap : internalMap) {
            setOfEntries.add(anInternalMap);
        }
        return setOfEntries;
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
    public MySet<K> keySet() {
        MySet<K> setOfKeys = new MySet<>();
        for (MapEnt<K, V> anInternalMap : internalMap) {
            setOfKeys.add(anInternalMap.getKey());
        }
        return setOfKeys;
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
        return internalMap.size();
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
        ArrayList<V> vals = new ArrayList<>();
        for (MapEnt<K, V> anInternalMap : internalMap) {
            vals.add(anInternalMap.getValue());
        }
        return vals;
    }

    /**
     * Finds the index a key is at.
     *
     * @param key Key to search for.
     * @return int index, or -1 if not found
     */
    public int findIndexFromKey(K key) {
        for (int i = 0; i < internalMap.size(); i++) {
            if (internalMap.get(i).getKey().equals(key)) return i;
        }
        return -1;
    }

    /**
     * Finds the value in the arrayList from a key.
     *
     * @param key key to look for
     * @return V value found, or null if not found.
     */
    public V findValueFromKey(K key) {
        for (MapEnt<K, V> anInternalMap : internalMap) {
            if (anInternalMap.getKey().equals(key)) return anInternalMap.getValue();
        }
        return null;
    }

    @Override
    public String toString() {
        String finalString = "";
        for(int i = 0; i<internalMap.size(); i++) {
            finalString+= "{"+internalMap.get(i).toString()+"}\n";
        }
        return finalString;
    }
}
