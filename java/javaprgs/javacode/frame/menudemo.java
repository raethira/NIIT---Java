import java.awt.*;
import java.applet.*;
public class menudemo 
{
	public static void main(String args[])
	{
	Frame frame=new Frame("WordFrame");
	frame.setVisible(true);
	frame.setSize(500,500);


	MenuBar menubar=new MenuBar();
	frame.setMenuBar(menubar);

	Menu m=new Menu("file");

	MenuItem new1=new MenuItem("new");
	m.add(new1);
	MenuItem open=new MenuItem("open");
	 m.add(open);
	MenuItem save=new MenuItem("save");
	m.add(save);
	CheckboxMenuItem naga=new CheckboxMenuItem("aaa");
	m.add(naga);
	m.addSeparator();
	Menu tool=new Menu("Tool");
	m.add(tool);
	tool.add("java");
	tool.add("javac");
	tool.add("clipart");
	menubar.add(m);

	}
}