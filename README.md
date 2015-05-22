Exercise description

1)
In this exercise you have to use the Template Method pattern.

2)
Below you see the Sequence interface. This interface is used when merging two sequences using the merging skeleton from SC1 (1st semester). All sequences contain objects that implements the Comparable<T> interface.

```
public interface Sequence<T> extends Iterable<T> {
    // Adds the element t at the rear of the sequence.
    public void add(T t);
    
    // The objects from s are added at the rear of the sequence // (in the order in s).
    public void addAll(Sequence<T> s);
    
    // Returns the first element in the sequence. 
    // The sequence is not changed.
    // Requires: The sequence is not empty. public T head();
    
    // Returns whether the sequence is empty.
    
    public boolean isEmpty();
    // Returns an iterator on the sequence.

    @Override
    public Iterator<T> iterator();
    // Removes the first element of the sequence. // Requires: The sequence is not empty. public void tail();
}
```

The interface Sequence and the implementation of ListSequence is in the file MergingTemplate.jar (the Team class and the MergingTemplate class are in the file too).
Test the sequence in a test class. The test must:

- Create a ListSequence, create and insert the following 4 elements of type Team in the sequence.
Teams from the club AGF:
o ”Tuesday – basketball” 
o ”Tuesday – volleyball” 
o ”Thursday – football” 
o ”Thursday – handball”

Insert the teams in the order listed here.

-Create a ListSequence and insert the following 3 teams in the sequence. Teams from the club AIA.
o ”Tuesday – basketball” 
o ”Wednesday – floorball” 
o ”Thursday – football”

Insert the teams in the order listed here.

-Traverse each of the two sequences and print out all the teams.

The merging skeleton is declared as a template method here:
```
public abstract class MergingTemplate<T extends Comparable<T>> {
     // Template method for merging.
     // Pre: s1 and s2 are sorted in not-descending order and
    // g is an empty sequence.
    // Post: g is a sorted sequence containing the result of
    // the merging of s1 and s2.
    
    public final void merge(Sequence<T> s1, Sequence<T> s2, Sequence<T> g) {
            while (!s1.isEmpty() && !s2.isEmpty()) {
                if (s1.head().compareTo(s2.head()) < 0) {
                    move(s1, g);
                 }
                else if (s1.head().compareTo(s2.head()) > 0) {
                    move(s2, g);
                }
                else {
                    move(s1, s2, g);
                } 
            }
        
        if (!s1.isEmpty()) { moveTail(s1, g);
         }
        else if (!s2.isEmpty()) {
              moveTail(s2, g);
        }
    }

    // Hook methods that are used by the template method,
    // and is overridden in subclasses.
    protected void move(Sequence<T> s, Sequence<T> g) { }
    protected void move(Sequence<T> s1, Sequence<T> s2, Sequence<T> g) { } 
    protected void moveTail(Sequence<T> s, Sequence<T> q) {}
}
```

3)
Program the class MergingTemplate and a subclass named MergeAllTeams. Use this class to
merge two sequences of teams. If two teams are the same, both teams must be included in the
returned sequence. The declaration of the class is
public class MergeAllTeams extends MergingTemplate<Team> { ... }

4)
Extend the test class. The test must:
- Use MergeAllTeams to create a sorted result sequence with all the teams
- Traverse the result sequence and print out all the teams.

5)
In this exercise you must create another subclass named JoinTeams. This time the result sequence must contain the teams that are in both sequences (with only one occurrence in the result sequence - unless the same team occurs multiple times in both sequences) .
Add a test of JoinTeams to the test class.
