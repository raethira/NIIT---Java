import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=appcalc height=500 width=500>
</applet>*/
public class appcalc extends Applet implements ActionListener
{
	char oper;
	float a,b,res;
	TextField t;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,bcan,badd,bsub,bmul,bdiv,bs,bc,bt,bon,bx;
	Label l1,l2,l3,l4;
	public void start()
	{
		Button b0=new Button("0");
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button beq=new Button("=");
		Button bcan=new Button("c");
		Button badd=new Button("+");
		Button bsub=new Button("-");
		Button bmul=new Button("*");
		Button bdiv=new Button("/");
		Button bs=new Button("SIN");
		Button bc=new Button("COS");
		Button bt=new Button("TAN");
		Button bx=new Button("1/X");
		Button bon=new Button("ON");
		
		TextField t=new TextField();
		Label l1=new Label();	
		Label l2=new Label();
		Label l3=new Label();
		Label l4=new Label();
	
		setBackground(Color.gray);
		setForeground(Color.red);
		setLayout(new GridLayout(5,5));
				
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			badd.addActionListener(this);
			bs.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			bsub.addActionListener(this);
			bc.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			bdiv.addActionListener(this);
			bt.addActionListener(this);
			b0.addActionListener(this);
			bcan.addActionListener(this);
			bmul.addActionListener(this);
			bx.addActionListener(this);
			beq.addActionListener(this);
			bon.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent ae)
		{
			String s=ae.getActionCommand();
			if(s.equals("SIN"))
			{
				double d=Double.parseDouble(t.getText());
				double r=(3.14*d)/180;
				t.setText(Double.toString(Math.sin(r)));
				return;
			}
			if(s.equals("COS"))
			{
				double d=Double.parseDouble(t.getText());
				double r=(3.14*d)/180;
				t.setText(Double.toString(Math.cos(r)));
	
			return;
			}
			if(s.equals("TAN"))
			{
				double d=Double.parseDouble(t.getText());
				double r=(3.14*d)/180;
				t.setText(Double.toString(Math.sin(r)));
				return;
			}
			if(s.equals("1/X"))
			{
				float f=Float.parseFloat(t.getText());
				t.setText(Float.toString(1/f));
				return;
			}
			showStatus(s);
			char c=s.charAt(0);
			switch(s.charAt(0))
			{
				case '+':
				case '-':
				case '*':
				case '/':
				a=Float.parseFloat(t.getText());
				t.setText(" ");
				oper=c;
				break;
				case '=':
				b=Float.parseFloat(t.getText());
				switch(oper)
				{
					case '+':
					res=a+b;
					break;
					case '-':
					res=a-b;
					break;
					case '*':
					res=a*b;
					break;
					case '/':
					res=a/b;
					break;
				}
				t.setText(Float.toString(res));
				break;
				default:
				t.setText(t.getText()+s);
				break;
			}
	}


	
}

				