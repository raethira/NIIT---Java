Compiled from Label.java
public class java.awt.Label extends java.awt.Component implements javax.accessibility.Accessible {
    public static final int LEFT;
    public static final int CENTER;
    public static final int RIGHT;
    java.lang.String text;
    int alignment;
    public java.awt.Label();
    public java.awt.Label(java.lang.String);
    public java.awt.Label(java.lang.String,int);
    java.lang.String constructComponentName();
    public void addNotify();
    public int getAlignment();
    public synchronized void setAlignment(int);
    public java.lang.String getText();
    public void setText(java.lang.String);
    protected java.lang.String paramString();
    public javax.accessibility.AccessibleContext getAccessibleContext();
    static {};
    protected class java.awt.Label. AccessibleAWTLabel extends java.awt.Component. AccessibleAWTComponent 
    /* ACC_SUPER bit NOT set */
{
        public java.awt.Label.AccessibleAWTLabel(java.awt.Label);
        public java.lang.String getAccessibleName();
        public javax.accessibility.AccessibleRole getAccessibleRole();
    }
}
