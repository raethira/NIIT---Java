Compiled from "SortedMap.java"
public interface java.util.SortedMap extends java.util.Map{
    public abstract java.util.Comparator comparator();
    public abstract java.util.SortedMap subMap(java.lang.Object, java.lang.Object);
    public abstract java.util.SortedMap headMap(java.lang.Object);
    public abstract java.util.SortedMap tailMap(java.lang.Object);
    public abstract java.lang.Object firstKey();
    public abstract java.lang.Object lastKey();
}

