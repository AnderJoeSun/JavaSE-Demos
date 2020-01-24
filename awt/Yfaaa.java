import java.awt.*;
import java.awt.event.*;

public class Yfaaa extends Frame{
	Panel p1;
	Panel p2;
	Panel p3;
	Panel p4;
	
	public void setP1(){
		p1=new Panel();
		p1.setLayout(new BorderLayout(3,9));
		Button b1=new Button("North");
		Button b2=new Button("West");
		Button b3=new Button("South");
		Button b4=new Button("East");
		Button b5=new Button("Center");
		p1.add(b1,BorderLayout.NORTH);
		p1.add(b2,BorderLayout.WEST);
		p1.add(b3,BorderLayout.EAST);
		p1.add(b4,BorderLayout.SOUTH);
	  p1.add(b4,BorderLayout.CENTER);
	}
	
	public void setP2(){
		p2=new Panel();
		p2.setLayout(new FlowLayout());
		Button b1=new Button("Joyu");
		Button b2=new Button("Molyn");
		p2.add(b1);
		p2.add(b2);
	}
	
  public void setP3(){
  	p3=new Panel();
  	p3.setLayout(new GridLayout(2,3));
  	Button b1=new Button("a"); 
  	b1.addActionListener(new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			((Button)e.getSource()).setLabel("Loves");
  		}
  	});
	  Button b2=new Button("b"); 
	  Button b3=new Button("c"); 
	  Button b4=new Button("d"); 
	  Button b5=new Button("e"); 
	  Button b6=new Button("f");
	  p3.add(b1);
	  p3.add(b2);
	  p3.add(b3);
	  p3.add(b4);
	  p3.add(b5);
	  p3.add(b6);
	}
	
	public void setP4(){
		p4=new Panel();
		final CardLayout cl=new CardLayout();
		p4.setLayout(cl);
		Button b1=new Button("a");
		Button b2=new Button("b");
		p4.add(b1,"kjdsfl;");
		p4.add(b2,"kjdflski");
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl.next(p4);
			}
		};
		
		b1.addActionListener(al);
		b2.addActionListener(al);
	}
	
	public Yfaaa(){
		super("Yfaaa");
		setSize(600,400);
		setLocation(100,100);
		setLayout(new GridLayout(2,2));
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setP1();
		add(p1);
		setP2();
		add(p2);
		setP3();
		add(p3);
		setP4();
		add(p4);
	}
		
	public static void main(String arg[]){
		Yfaaa yf=new Yfaaa();
		yf.show();
	}
}