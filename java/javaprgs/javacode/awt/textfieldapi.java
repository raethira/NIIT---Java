Compiled from TextField.java
public class java.awt.TextField extends java.awt.TextComponent {
    int columns;
    char echoChar;
    transient java.awt.event.ActionListener actionListener;
    static java.lang.Class class$java$awt$event$ActionListener;
    public java.awt.TextField();
    public java.awt.TextField(java.lang.String);
    public java.awt.TextField(int);
    public java.awt.TextField(java.lang.String,int);
    java.lang.String constructComponentName();
    public void addNotify();
    public char getEchoChar();
    public void setEchoChar(char);
    public synchronized void setEchoCharacter(char);
    public void setText(java.lang.String);
    public boolean echoCharIsSet();
    public int getColumns();
    public synchronized void setColumns(int);
    public java.awt.Dimension getPreferredSize(int);
    public java.awt.Dimension preferredSize(int);
    public java.awt.Dimension getPreferredSize();
    public java.awt.Dimension preferredSize();
    public java.awt.Dimension getMinimumSize(int);
    public java.awt.Dimension minimumSize(int);
    public java.awt.Dimension getMinimumSize();
    public java.awt.Dimension minimumSize();
    public synchronized void addActionListener(java.awt.event.ActionListener);
    public synchronized void removeActionListener(java.awt.event.ActionListener);
    public java.util.EventListener getListeners(java.lang.Class)[];
    boolean eventEnabled(java.awt.AWTEvent);
    protected void processEvent(java.awt.AWTEvent);
    protected void processActionEvent(java.awt.event.ActionEvent);
    protected java.lang.String paramString();
    public javax.accessibility.AccessibleContext getAccessibleContext();
    static java.lang.Class class$(java.lang.String);
    static {};
    protected class java.awt.TextField. AccessibleAWTTextField extends java.awt.TextComponent. AccessibleAWTTextComponent 
    /* ACC_SUPER bit NOT set */
{
        protected java.awt.TextField.AccessibleAWTTextField(java.awt.TextField);
        public javax.accessibility.AccessibleStateSet getAccessibleStateSet();
    }
}
