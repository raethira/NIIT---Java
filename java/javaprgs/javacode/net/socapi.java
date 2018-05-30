Compiled from Socket.java
public class java.net.Socket extends java.lang.Object {
    java.net.SocketImpl impl;
    protected java.net.Socket();
    protected java.net.Socket(java.net.SocketImpl) throws java.net.SocketException;
    public java.net.Socket(java.lang.String,int) throws java.net.UnknownHostException, java.io.IOException;
    public java.net.Socket(java.net.InetAddress,int) throws java.io.IOException;
    public java.net.Socket(java.lang.String,int,java.net.InetAddress,int) throws java.io.IOException;
    public java.net.Socket(java.net.InetAddress,int,java.net.InetAddress,int) throws java.io.IOException;
    public java.net.Socket(java.lang.String,int,boolean) throws java.io.IOException;
    public java.net.Socket(java.net.InetAddress,int,boolean) throws java.io.IOException;
    public java.net.InetAddress getInetAddress();
    public java.net.InetAddress getLocalAddress();
    public int getPort();
    public int getLocalPort();
    public java.io.InputStream getInputStream() throws java.io.IOException;
    public java.io.OutputStream getOutputStream() throws java.io.IOException;
    public void setTcpNoDelay(boolean) throws java.net.SocketException;
    public boolean getTcpNoDelay() throws java.net.SocketException;
    public void setSoLinger(boolean, int) throws java.net.SocketException;
    public int getSoLinger() throws java.net.SocketException;
    public synchronized void setSoTimeout(int) throws java.net.SocketException;
    public synchronized int getSoTimeout() throws java.net.SocketException;
    public synchronized void setSendBufferSize(int) throws java.net.SocketException;
    public synchronized int getSendBufferSize() throws java.net.SocketException;
    public synchronized void setReceiveBufferSize(int) throws java.net.SocketException;
    public synchronized int getReceiveBufferSize() throws java.net.SocketException;
    public void setKeepAlive(boolean) throws java.net.SocketException;
    public boolean getKeepAlive() throws java.net.SocketException;
    public synchronized void close() throws java.io.IOException;
    public void shutdownInput() throws java.io.IOException;
    public void shutdownOutput() throws java.io.IOException;
    public java.lang.String toString();
    public static synchronized void setSocketImplFactory(java.net.SocketImplFactory) throws java.io.IOException;
}
