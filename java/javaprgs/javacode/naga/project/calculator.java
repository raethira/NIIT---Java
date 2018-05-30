import java.applet.*;
import java.awt.*;
import java.awt.event.*;

        /*<APPLET CODE="calculator" HEIGHT=200 WIDTH="235">
          </APPLET>*/

          public class calculator extends Applet
           implements ActionListener
           {
             //Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
             float a,b,res;
             char oper;
             Font f = new Font("Sans",Font.BOLD,22);

             Button b1 = new Button("1");
             Button b2 = new Button("2");
             Button b3 = new Button("3");
             Button b4 = new Button("4");
             Button b5 = new Button("5");
             Button b6 = new Button("6");
             Button b7 = new Button("7");
             Button b8 = new Button("8");
             Button b0 = new Button("0");
             Button b9 = new Button("9");

             Button bp = new Button("+");
             Button bm = new Button("-");
             Button bd = new Button("/");
             Button bmul = new Button("*");
             Button bequ = new Button("=");
             Button bpnt = new Button(".");

             Button bsin = new Button("SIN");
             Button bcos = new Button("COS");
             Button btan = new Button("TAN");
             Button binv = new Button("1/X");

             Button bc = new Button("C");

             TextField t = new TextField(20);

             public void init()
             {
                 setBackground(Color.cyan);
                 setForeground(Color.red);
                 setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
                 setFont(f);
                 add(t);
             }

             public void start()
             {
             
             //  setLayout(new GridLayout(4,3));
               b1.addActionListener(this);
               b2.addActionListener(this);
               b3.addActionListener(this);
               b4.addActionListener(this);
               b5.addActionListener(this);
               b6.addActionListener(this);
               b7.addActionListener(this);
               b8.addActionListener(this);
               b9.addActionListener(this);
               b0.addActionListener(this);

               bp.addActionListener(this);
               bm.addActionListener(this);
               bd.addActionListener(this);
               bmul.addActionListener(this);
               bequ.addActionListener(this);
               bpnt.addActionListener(this);

               bsin.addActionListener(this);
               bcos.addActionListener(this);
               btan.addActionListener(this);
               binv.addActionListener(this);
               bc.addActionListener(this);

               add(b1);
               add(b2);
               add(b3);
               add(bp);
               add(bsin);
               add(b4);
               add(b5);
               add(b6);
               add(bm);
               add(bcos);
               add(b7);
               add(b8);
               add(b9);
               add(bd);
               add(btan);
               add(b0);
               add(bpnt);
               add(bmul);
               add(binv);
               add(bequ);
               add(bc);
             }

             public void actionPerformed(ActionEvent ae)
             {
               String s = ae.getActionCommand();

                 if(s.equals("SIN"))
                 {
                   double d = Double.parseDouble(t.getText());
                   double r = (3.14 * d) / 180;
                   t.setText( Double.toString( Math.sin(r) ) );
                   return;
                 }

                 if(s.equals("COS"))
                 {
                   double d = Double.parseDouble(t.getText());
                   double r = (3.14 * d) / 180;
                   t.setText( Double.toString( Math.cos(r) ) );
                   return;
                 }

                 if(s.equals("TAN"))
                 {
                   double d = Double.parseDouble(t.getText());
                   double r = (3.14 * d) / 180;
                   t.setText( Double.toString( Math.tan(r) ) );
                   return;
                 }

                 if(s.equals("C"))
                 {
                 t.setText("");
                 return;
                 }

                 if(s.equals("1/X"))
                 {
                   float f  = Float.parseFloat(t.getText());
                   t.setText(Float.toString(1 / f));
                   return;
                 }

               showStatus(s);
               char c = s.charAt(0);


                        switch(s.charAt(0))
                         {
                                case '+': 
                                case '-':
                                case '/':
                                case '*':

                                       a = Float.parseFloat(t.getText());
                                      t.setText("");
                                      oper = c;
                                      break;


                                case '=':            
                                       b = Float.parseFloat(t.getText());

                                      switch(oper)
                                      {
                                         case '+': res = a + b;break;
                                         case '-': res = a - b;break;
                                         case '/': res = a / b;break;
                                         case '*': res = a * b;break;
                                      }
                                      t.setText(Float.toString(res));
                                      break;


                  default:
                                      t.setText(t.getText() + s);
                                      break;
                                        
                                       
                         }

           
            }

        }
