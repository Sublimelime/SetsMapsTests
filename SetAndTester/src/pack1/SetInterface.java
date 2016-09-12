package pack1;

import java.util.*;
public interface SetInterface<E>
{
    boolean add(E o);
	void clear();
	boolean contains(E o);
	boolean isEmpty();
	Iterator<E> iterator();
	boolean remove(E o);
	int size();
	Object[] toArray();
}