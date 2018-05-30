Compiled from "List.java"
public interface java.util.List extends java.util.Collection{
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean contains(java.lang.Object);
    public abstract java.util.Iterator iterator();
    public abstract java.lang.Object[] toArray();
    public abstract java.lang.Object[] toArray(java.lang.Object[]);
    public abstract boolean add(java.lang.Object);
    public abstract boolean remove(java.lang.Object);
    public abstract boolean containsAll(java.util.Collection);
    public abstract boolean addAll(java.util.Collection);
    public abstract boolean addAll(int, java.util.Collection);
    public abstract boolean removeAll(java.util.Collection);
    public abstract boolean retainAll(java.util.Collection);
    public abstract void clear();
    public abstract boolean equals(java.lang.Object);
    public abstract int hashCode();
    public abstract java.lang.Object get(int);
    public abstract java.lang.Object set(int, java.lang.Object);
    public abstract void add(int, java.lang.Object);
    public abstract java.lang.Object remove(int);
    public abstract int indexOf(java.lang.Object);
    public abstract int lastIndexOf(java.lang.Object);
    public abstract java.util.ListIterator listIterator();
    public abstract java.util.ListIterator listIterator(int);
    public abstract java.util.List subList(int, int);
}

