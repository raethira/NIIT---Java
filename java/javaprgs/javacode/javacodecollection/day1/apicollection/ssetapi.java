Compiled from "SortedSet.java"
public interface java.util.SortedSet extends java.util.Set{
    public abstract java.util.Comparator comparator();
    public abstract java.util.SortedSet subSet(java.lang.Object, java.lang.Object);
    public abstract java.util.SortedSet headSet(java.lang.Object);
    public abstract java.util.SortedSet tailSet(java.lang.Object);
    public abstract java.lang.Object first();
    public abstract java.lang.Object last();
}

