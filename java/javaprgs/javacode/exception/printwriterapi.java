Compiled from PrintWriter.java
public class java.io.PrintWriter extends java.io.Writer {
    protected java.io.Writer out;
    public java.io.PrintWriter(java.io.Writer);
    public java.io.PrintWriter(java.io.Writer,boolean);
    public java.io.PrintWriter(java.io.OutputStream);
    public java.io.PrintWriter(java.io.OutputStream,boolean);
    public void flush();
    public void close();
    public boolean checkError();
    protected void setError();
    public void write(int);
    public void write(char[], int, int);
    public void write(char[]);
    public void write(java.lang.String, int, int);
    public void write(java.lang.String);
    public void print(boolean);
    public void print(char);
    public void print(int);
    public void print(long);
    public void print(float);
    public void print(double);
    public void print(char[]);
    public void print(java.lang.String);
    public void print(java.lang.Object);
    public void println();
    public void println(boolean);
    public void println(char);
    public void println(int);
    public void println(long);
    public void println(float);
    public void println(double);
    public void println(char[]);
    public void println(java.lang.String);
    public void println(java.lang.Object);
}
