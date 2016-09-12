package pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created on 9/12/2016, 2:04 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project SetAndTester
 */

public class MySet<E> implements SetInterface<E> {

    private ArrayList<E> internalSet;

    public MySet() {
        this.internalSet = new ArrayList<>();
    }

    @Override
    public boolean add(E o) {
        if (!this.internalSet.contains(o)) { //add if there isn't a duplicate value in the set
            internalSet.add(o);
        }
        return false;
    }

    @Override
    public void clear() {
        for(int i =0; i< internalSet.size(); i++) {
            internalSet.remove(i);
        }
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return internalSet.iterator();
    }

    @Override
    public boolean remove(E o) {
        return internalSet.remove(o);
    }

    @Override
    public int size() {
        return internalSet.size();
    }

    @Override
    public Object[] toArray() {
        //todo toarray
        return null;
    }
}
