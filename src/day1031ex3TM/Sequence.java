package day1031ex3TM;

import java.util.Iterator;

public interface Sequence<T> extends Iterable<T>
{
    // Adds the element t at the rear of the sequence.
    public void add(T t);

    // The objects from s are added at the rear of the sequence 
    // (in the order in s).
    public void addAll(Sequence<T> s);

    // Returns the first element in the sequence. 
    // The sequence is not changed.
    // Requires: The sequence is not empty.    
    public T head();

    // Returns whether the sequence is empty.
    public boolean isEmpty();

    // Returns an iterator on the sequence.
    @Override
    public Iterator<T> iterator();

    // Removes the first element of the sequence.
    // Requires: The sequence is not empty.    
    public void tail();
}
