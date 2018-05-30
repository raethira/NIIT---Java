Compiled from InetAddress.java
public final class java.net.InetAddress extends java.lang.Object implements java.io.Serializable {
    java.lang.String hostName;
    int address;
    int family;
    static java.net.InetAddress anyLocalAddress;
    static java.net.InetAddressImpl impl;
    java.net.InetAddress();
    java.net.InetAddress(java.lang.String,byte[]);
    public boolean isMulticastAddress();
    public java.lang.String getHostName();
    java.lang.String getHostName(boolean);
    public byte getAddress()[];
    public java.lang.String getHostAddress();
    public int hashCode();
    public boolean equals(java.lang.Object);
    public java.lang.String toString();
    public static java.net.InetAddress getByName(java.lang.String) throws java.net.UnknownHostException;
    public static java.net.InetAddress getAllByName(java.lang.String)[] throws java.net.UnknownHostException;
    static java.net.InetAddress getAllByName0(java.lang.String, boolean)[] throws java.net.UnknownHostException;
    public static synchronized java.net.InetAddress getLocalHost() throws java.net.UnknownHostException;
    static {};
    static final class java.net.InetAddress. CacheEntry extends java.lang.Object 
    /* ACC_SUPER bit NOT set */
{
        java.lang.String hostname;
        java.lang.Object address;
        long expiration;
        java.net.InetAddress.CacheEntry(java.lang.String,java.lang.Object,long);
    }
}
