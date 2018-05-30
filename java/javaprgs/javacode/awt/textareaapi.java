Compiled from TextArea.java
public class java.awt.TextArea extends java.awt.TextComponent {
    int rows;
    int columns;
    public static final int SCROLLBARS_BOTH;
    public static final int SCROLLBARS_VERTICAL_ONLY;
    public static final int SCROLLBARS_HORIZONTAL_ONLY;
    public static final int SCROLLBARS_NONE;
    public java.awt.TextArea();
    public java.awt.TextArea(java.lang.String);
    public java.awt.TextArea(int,int);
    public java.awt.TextArea(java.lang.String,int,int);
    public java.awt.TextArea(java.lang.String,int,int,int);
    java.lang.String constructComponentName();
    public void addNotify();
    public void insert(java.lang.String, int);
    public synchronized void insertText(java.lang.String, int);
    public void append(java.lang.String);
    public synchronized void appendText(java.lang.String);
    public void replaceRange(java.lang.String, int, int);
    public synchronized void replaceText(java.lang.String, int, int);
    public int getRows();
    public void setRows(int);
    public int getColumns();
    public void setColumns(int);
    public int getScrollbarVisibility();
    public java.awt.Dimension getPreferredSize(int, int);
    public java.awt.Dimension preferredSize(int, int);
    public java.awt.Dimension getPreferredSize();
    public java.awt.Dimension preferredSize();
    public java.awt.Dimension getMinimumSize(int, int);
    public java.awt.Dimension minimumSize(int, int);
    public java.awt.Dimension getMinimumSize();
    public java.awt.Dimension minimumSize();
    protected java.lang.String paramString();
    public javax.accessibility.AccessibleContext getAccessibleContext();
    static {};
    protected class java.awt.TextArea. AccessibleAWTTextArea extends java.awt.TextComponent. AccessibleAWTTextComponent 
    /* ACC_SUPER bit NOT set */
{
        protected java.awt.TextArea.AccessibleAWTTextArea(java.awt.TextArea);
        public javax.accessibility.AccessibleStateSet getAccessibleStateSet();
    }
}
