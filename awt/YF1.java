import java.awt.*;
import java.awt.event.*;
class YF1 extends Frame{
	private Panel p1;
	private Panel p2;
	private Panel p3;
	private Panel p4;
	
	public void setP1(){
		p1=new Panel();
		p1.setLayout(new BorderLayout());
		Button b1=new Button("b1");
		Button b2=new Button("b2");
		Button b3=new Button("b3");
		Button b4=new Button("b4");
		Button b5=new Button("b5");
		p1.add(b1,BorderLayout.WEST);
		p1.add(b2,BorderLayout.EAST);
		p1.add(b3,BorderLayout.CENTER);
		p1.add(b4,BorderLayout.SOUTH);
		p1.add(b5,BorderLayout.NORTH);
	}
	public void setP2(){
		p2=new Panel();
		Button b1=new Button("b1");
		b1.addActionListener(new ActionListener(){
	  	public void actionPerformed(ActionEvent e){
	  		((Button)e.getSource()).setLabel("lover");
	  	}
	  });
		Button b2=new Button("b2");
		Button b3=new Button("b3");
		Button b4=new Button("b4");
		Button b5=new Button("b5");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
	}
	public void setP3(){
		p3=new Panel();
		p3.setLayout(new GridLayout(3,2));
		
		Button b1=new Button("b1");
		Button b2=new Button("b2");
		Button b3=new Button("b3");
		Button b4=new Button("b4");
		Button b5=new Button("b5");
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
	}
	public void setP4(){
		p4=new Panel();
		final CardLayout cl=new CardLayout();
		p4.setLayout(cl);
		
		Button b1=new Button("Joyu");
		Button b2=new Button("Molyn");
		
		
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cl.next(p4);
			}
		};
		b1.addActionListener(al);
		b2.addActionListener(al);
		p4.add(b1,"a");
		p4.add(b2,"b");	
		
	}
	public YF1(){
		super("Joyu and Molyn");
		setSize(600,400);
		setLocation(200,100);
		setLayout(new GridLayout(2,2));
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setP1();
		setP2();
		setP3();
		setP4();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
	}
		
		
	public static void main(String arg[]){
		YF1 yf=new YF1();
		yf.show();
	}
}
		
		