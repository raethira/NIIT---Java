Compiled from Runtime.java
public class java.lang.Runtime extends java.lang.Object {
    public static java.lang.Runtime getRuntime();
    public void exit(int);
    public void addShutdownHook(java.lang.Thread);
    public boolean removeShutdownHook(java.lang.Thread);
    public void halt(int);
    public static void runFinalizersOnExit(boolean);
    public java.lang.Process exec(java.lang.String) throws java.io.IOException;
    public java.lang.Process exec(java.lang.String, java.lang.String[]) throws java.io.IOException;
    public java.lang.Process exec(java.lang.String, java.lang.String[], java.io.File) throws java.io.IOException;
    public java.lang.Process exec(java.lang.String[]) throws java.io.IOException;
    public java.lang.Process exec(java.lang.String[], java.lang.String[]) throws java.io.IOException;
    public java.lang.Process exec(java.lang.String[], java.lang.String[], java.io.File) throws java.io.IOException;
    public native long freeMemory();
    public native long totalMemory();
    public native void gc();
    public void runFinalization();
    public native void traceInstructions(boolean);
    public native void traceMethodCalls(boolean);
    public void load(java.lang.String);
    synchronized void load0(java.lang.Class, java.lang.String);
    public void loadLibrary(java.lang.String);
    synchronized void loadLibrary0(java.lang.Class, java.lang.String);
    public java.io.InputStream getLocalizedInputStream(java.io.InputStream);
    public java.io.OutputStream getLocalizedOutputStream(java.io.OutputStream);
    static {};
}
