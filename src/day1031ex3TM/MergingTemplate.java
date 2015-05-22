package day1031ex3TM;

public abstract class MergingTemplate<T extends Comparable<T>>
{
    // Template method for merging.
    // Pre: s1 and s2 are sorted in not-descending order and
    //      g is an empty sequence.
    // Post: g is a sorted sequence containing the result of 
    //      the merging of s1 and s2.
    public final void merge(Sequence<T> s1, Sequence<T> s2, Sequence<T> g)
    {
        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.head().compareTo(s2.head()) < 0) {
                this.move(s1, g);
            }
            else if (s1.head().compareTo(s2.head()) > 0) {
                this.move(s2, g);
            }
            else {
                this.move(s1, s2, g);
            }
        }
        if (!s1.isEmpty()) {
            this.moveTail(s1, g);
        }
        else if (!s2.isEmpty()) {
            this.moveTail(s2, g);
        }
    }

    // Hook methods that are used by the template method, 
    // and is overridden in subclasses.

    protected void move(Sequence<T> s, Sequence<T> g)
    {
        //
    }

    protected void move(Sequence<T> s1, Sequence<T> s2, Sequence<T> g)
    {
        //
    }

    protected void moveTail(Sequence<T> s, Sequence<T> q)
    {
        //
    }

}
