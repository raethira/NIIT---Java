import java.applet.*;
import java.awt.*;
/*<applet code=awtform height=500 width=500>
</applet>*/
public class awtform extends Applet
{
	public void init()
	{
	setLayout(new GridLayout(5,5));
	Label l1=new Label("name");
	Label l2=new Label("age");
	Label l3=new Label("sex");
	Label l4=new Label("remarks");
	Label l5=new Label("Education");
	Label l6=new Label("Language known");

	TextField t1=new TextField();
	TextField t2=new TextField();

	TextArea ta=new TextArea();
	
	Checkbox c1=new Checkbox("tamil",true);	
	Checkbox c2=new Checkbox("Engish",true);
	Checkbox c3=new Checkbox("Hindi",true);

	CheckboxGroup cg=new CheckboxGroup();
	Checkbox c4=new Checkbox("male",cg,false);
	Checkbox c5=new Checkbox("female",cg,true);

	Choice c=new Choice();
	c.insert("aaa",1);
	c.insert("bbbaaa",4);
	c.insert("cccaaa",3);

	Button b1=new Button("SUBMIT");
	Button b2=new Button("CANCEL");

	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(c4);
	add(c5);
	add(l4);
	add(ta);
	add(l5);
	add(c);
	add(l6);
	add(c1);
	add(c2);
	add(c3);
	add(b1);
	add(b2);
	}
}
	