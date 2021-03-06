Compiled from "Map.java"
public interface java.util.Map{
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean containsKey(java.lang.Object);
    public abstract boolean containsValue(java.lang.Object);
    public abstract java.lang.Object get(java.lang.Object);
    public abstract java.lang.Object put(java.lang.Object, java.lang.Object);
    public abstract java.lang.Object remove(java.lang.Object);
    public abstract void putAll(java.util.Map);
    public abstract void clear();
    public abstract java.util.Set keySet();
    public abstract java.util.Collection values();
    public abstract java.util.Set entrySet();
    public abstract boolean equals(java.lang.Object);
    public abstract int hashCode();
}

