Compiled from System.java
public final class java.lang.System extends java.lang.Object {
    public static final java.io.InputStream in;
    public static final java.io.PrintStream out;
    public static final java.io.PrintStream err;
    public static void setIn(java.io.InputStream);
    public static void setOut(java.io.PrintStream);
    public static void setErr(java.io.PrintStream);
    public static void setSecurityManager(java.lang.SecurityManager);
    public static java.lang.SecurityManager getSecurityManager();
    public static native long currentTimeMillis();
    public static native void arraycopy(java.lang.Object, int, java.lang.Object, int, int);
    public static native int identityHashCode(java.lang.Object);
    public static java.util.Properties getProperties();
    public static void setProperties(java.util.Properties);
    public static java.lang.String getProperty(java.lang.String);
    public static java.lang.String getProperty(java.lang.String, java.lang.String);
    public static java.lang.String setProperty(java.lang.String, java.lang.String);
    public static java.lang.String getenv(java.lang.String);
    public static void exit(int);
    public static void gc();
    public static void runFinalization();
    public static void runFinalizersOnExit(boolean);
    public static void load(java.lang.String);
    public static void loadLibrary(java.lang.String);
    public static native java.lang.String mapLibraryName(java.lang.String);
    static native java.lang.Class getCallerClass();
    static {};
}
