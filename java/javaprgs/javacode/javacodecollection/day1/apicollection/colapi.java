Compiled from "Collection.java"
public interface java.util.Collection extends java.lang.Iterable{
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
    public abstract boolean removeAll(java.util.Collection);
    public abstract boolean retainAll(java.util.Collection);
    public abstract void clear();
    public abstract boolean equals(java.lang.Object);
    public abstract int hashCode();
}
