Compiled from "Properties.java"
public class java.util.Properties extends java.util.Hashtable{
    protected java.util.Properties defaults;
    public java.util.Properties();
    public java.util.Properties(java.util.Properties);
    public synchronized java.lang.Object setProperty(java.lang.String, java.lang.String);
    public synchronized void load(java.io.InputStream)       throws java.io.IOException;
    public synchronized void save(java.io.OutputStream, java.lang.String);
    public synchronized void store(java.io.OutputStream, java.lang.String)       throws java.io.IOException;
    public synchronized void loadFromXML(java.io.InputStream)       throws java.io.IOException, java.util.InvalidPropertiesFormatException;
    public synchronized void storeToXML(java.io.OutputStream, java.lang.String)       throws java.io.IOException;
    public synchronized void storeToXML(java.io.OutputStream, java.lang.String, java.lang.String)       throws java.io.IOException;
    public java.lang.String getProperty(java.lang.String);
    public java.lang.String getProperty(java.lang.String, java.lang.String);
    public java.util.Enumeration propertyNames();
    public void list(java.io.PrintStream);
    public void list(java.io.PrintWriter);
    static {};
}

