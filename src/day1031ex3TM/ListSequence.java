package day1031ex3TM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSequence<T> implements Sequence<T>
{
    public List<T> list;

    public ListSequence()
    {
        list = new ArrayList<T>();
    }

    // Adds the element t at the rear of the sequence.
    @Override
    public void add(T t)
    {
        list.add(t);
    }

    // The objects from s is added at the rear of the sequence 
    // (in the order in s).
    @Override
    public void addAll(Sequence<T> s)
    {
        for (Iterator<T> iterator = s.iterator(); iterator.hasNext();) {
            T obj = iterator.next();
            list.add(obj);
        }

//		Iterator<T> iterator = s.iterator();
//		while (iterator.hasNext()) {
//			T obj = iterator.next();
//			list.add(obj);
//		}

//        for (T obj : s) {
//            list.add(obj);
//        }
    }

    // Returns the first element in the sequence. 
    // The sequence is not changed.
    // Requires: The sequence is not empty.    
    @Override
    public T head()
    {
        return list.get(0);
    }

    // Returns whether the sequence is empty.
    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    // Returns an iterator on the sequence.
    @Override
    public Iterator<T> iterator()
    {
        return list.iterator();
    }

    // Removes the first element of the sequence.
    // Requires: The sequence is not empty.    
    @Override
    public void tail()
    {
        list.remove(0);
    }
    

}
