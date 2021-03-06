Compiled from DataOutputStream.java
public class java.io.DataOutputStream extends java.io.FilterOutputStream implements java.io.DataOutput {
    protected int written;
    public java.io.DataOutputStream(java.io.OutputStream);
    public synchronized void write(int) throws java.io.IOException;
    public synchronized void write(byte[], int, int) throws java.io.IOException;
    public void flush() throws java.io.IOException;
    public final void writeBoolean(boolean) throws java.io.IOException;
    public final void writeByte(int) throws java.io.IOException;
    public final void writeShort(int) throws java.io.IOException;
    public final void writeChar(int) throws java.io.IOException;
    public final void writeInt(int) throws java.io.IOException;
    public final void writeLong(long) throws java.io.IOException;
    public final void writeFloat(float) throws java.io.IOException;
    public final void writeDouble(double) throws java.io.IOException;
    public final void writeBytes(java.lang.String) throws java.io.IOException;
    public final void writeChars(java.lang.String) throws java.io.IOException;
    public final void writeUTF(java.lang.String) throws java.io.IOException;
    static int writeUTF(java.lang.String, java.io.DataOutput) throws java.io.IOException;
    public final int size();
}
