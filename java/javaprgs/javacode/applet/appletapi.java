Compiled from Applet.java
public class java.applet.Applet extends java.awt.Panel {
    javax.accessibility.AccessibleContext accessibleContext;
    public java.applet.Applet();
    public final void setStub(java.applet.AppletStub);
    public boolean isActive();
    public java.net.URL getDocumentBase();
    public java.net.URL getCodeBase();
    public java.lang.String getParameter(java.lang.String);
    public java.applet.AppletContext getAppletContext();
    public void resize(int, int);
    public void resize(java.awt.Dimension);
    public void showStatus(java.lang.String);
    public java.awt.Image getImage(java.net.URL);
    public java.awt.Image getImage(java.net.URL, java.lang.String);
    public static final java.applet.AudioClip newAudioClip(java.net.URL);
    public java.applet.AudioClip getAudioClip(java.net.URL);
    public java.applet.AudioClip getAudioClip(java.net.URL, java.lang.String);
    public java.lang.String getAppletInfo();
    public java.util.Locale getLocale();
    public java.lang.String getParameterInfo()[][];
    public void play(java.net.URL);
    public void play(java.net.URL, java.lang.String);
    public void init();
    public void start();
    public void stop();
    public void destroy();
    public javax.accessibility.AccessibleContext getAccessibleContext();
    protected class java.applet.Applet. AccessibleApplet extends java.awt.Panel. AccessibleAWTPanel 
    /* ACC_SUPER bit NOT set */
{
        protected java.applet.Applet.AccessibleApplet(java.applet.Applet);
        public javax.accessibility.AccessibleRole getAccessibleRole();
        public javax.accessibility.AccessibleStateSet getAccessibleStateSet();
    }
}
