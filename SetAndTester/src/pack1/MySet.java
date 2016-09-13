package pack1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created on 9/12/2016, 2:04 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project SetAndTester
 */

@SuppressWarnings("CanBeFinal")
public class MySet<E> implements SetInterface<E> {

    private ArrayList<E> internalSet;

    public MySet() {
        this.internalSet = new ArrayList<>();
    }

    @Override
    public boolean add(E o) {
        if (!this.internalSet.contains(o)) { //add if there isn't a duplicate value in the set
            internalSet.add(o);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        internalSet.clear();
    }

    @Override
    public boolean contains(E o) {
        for (E anInternalSet : internalSet) {
            if (anInternalSet.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return internalSet.isEmpty();
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
        Object[] array = new Object[internalSet.size()];
        for (int i = 0; i < internalSet.size(); i++) {
            array[i] = internalSet.get(i);
        }
        return array;
    }
}
