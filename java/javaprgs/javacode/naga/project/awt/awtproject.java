import java.applet.*;
import java.awt.*;
/*<applet code=awtproject height=500 width=500>
</applet>*/
public class awtproject extends Applet
{
	Font f=new Font("Helvitica",Font.BOLD,30);
	Font f1=new Font("Arial",Font.ITALIC,15);
	public void init()
	{
		setFont(f);
		Label l1=new Label("Moneysaver Corporation");
	 	setFont(f1);
		Label l2=new Label();
		Label l3=new Label("Name");
		Label l4=new Label("E-Mail Address");
		Label l5=new Label("Subject");
		Label l6=new Label("Message");
		
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField("FeedBack");
		
		TextArea t4=new TextArea("Type Your Message Here",4,4);
		
		Button b1=new Button("SUBMIT");
		Button b2=new Button("CANCEL");
		
		setLayout (new GridLayout(6,2));
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(l4);
		add(t2);
		add(l5);
		add(t3);
		add(l6);
		add(t4);
		add(b1);
		add(b2);
	}
}
