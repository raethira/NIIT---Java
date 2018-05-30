Compiled from "TreeMap.java"
public class java.util.TreeMap extends java.util.AbstractMap implements java.util.SortedMap,java.lang.Cloneable,java.io.Serializable{
    public java.util.TreeMap();
    public java.util.TreeMap(java.util.Comparator);
    public java.util.TreeMap(java.util.Map);
    public java.util.TreeMap(java.util.SortedMap);
    public int size();
    public boolean containsKey(java.lang.Object);
    public boolean containsValue(java.lang.Object);
    public java.lang.Object get(java.lang.Object);
    public java.util.Comparator comparator();
    public java.lang.Object firstKey();
    public java.lang.Object lastKey();
    public void putAll(java.util.Map);
    public java.lang.Object put(java.lang.Object, java.lang.Object);
    public java.lang.Object remove(java.lang.Object);
    public void clear();
    public java.lang.Object clone();
    public java.util.Set keySet();
    public java.util.Collection values();
    public java.util.Set entrySet();
    public java.util.SortedMap subMap(java.lang.Object, java.lang.Object);
    public java.util.SortedMap headMap(java.lang.Object);
    public java.util.SortedMap tailMap(java.lang.Object);
    void readTreeSet(int, java.io.ObjectInputStream, java.lang.Object)       throws java.io.IOException, java.lang.ClassNotFoundException;
    void addAllForTreeSet(java.util.SortedSet, java.lang.Object);
    static int access$100(java.util.TreeMap);
    static java.util.TreeMap$Entry access$300(java.util.TreeMap);
    static java.util.TreeMap$Entry access$400(java.util.TreeMap, java.util.TreeMap$Entry);
    static boolean access$500(java.lang.Object, java.lang.Object);
    static void access$600(java.util.TreeMap, java.util.TreeMap$Entry);
    static java.util.TreeMap$Entry access$800(java.util.TreeMap, java.lang.Object);
    static int access$900(java.util.TreeMap, java.lang.Object, java.lang.Object);
    static java.util.Comparator access$1000(java.util.TreeMap);
    static java.util.TreeMap$Entry access$1100(java.util.TreeMap, java.lang.Object);
    static java.lang.Object access$1200(java.util.TreeMap$Entry);
    static java.util.TreeMap$Entry access$1300(java.util.TreeMap);
    static java.util.TreeMap$Entry access$1400(java.util.TreeMap, java.lang.Object);
    static int access$1600(java.util.TreeMap);
}

