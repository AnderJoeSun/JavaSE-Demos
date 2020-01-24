package joyu;
import java.awt.event.*;
import java.awt.*; 

public class YourFrame extends Frame {
  private Panel p1;
  private Panel p2;
  private Panel p3;
  private Panel p4;
  
  public YourFrame() {
  	super("YourFrame");
    setSize(500,300);
    setLocation(200,180);
    setLayout(new GridLayout(2,2));
    setP1();
    setP2();
    setP3();
    setP4();
    add(p1);
    add(p2);
    add(p3);
    add(p4);
    addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e){
    		System.exit(0);
    	}
    });
  }

  public void setP1(){
    p1=new Panel();
    BorderLayout b=new BorderLayout(2,4); 
    p1.setLayout(b);
    Button b1=new Button("North");
    Button b2=new Button("South");
    Button b3=new Button("West");
    Button b4=new Button("Center");
    Button b5=new Button("East");
    p1.add(b1,BorderLayout.NORTH);
    p1.add(b2,BorderLayout.SOUTH);
    p1.add(b3,BorderLayout.WEST);
    p1.add(b4,BorderLayout.CENTER);
    p1.add(b5,BorderLayout.EAST);
  }
  public void setP2(){
  	p2=new Panel();
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
  			((Button)e.getSource()).setLabel("LOVERS");
  		}
  	});
    Button b2=new Button("b");
    Button b3=new Button("c");
    Button b4=new Button("d");
    Button b5=new Button("f");
    p3.add(b1);
    p3.add(b2);
    p3.add(b3);
    p3.add(b4);
    p3.add(b5);
  }
  public void setP4(){
  	final CardLayout cl=new CardLayout();
  	p4=new Panel();
  	p4.setLayout(cl);
  	Button b1=new Button("Joyu loves Molyn..");
  	Button b2=new Button("Molyn loves Molyn,too!");
  	p4.add(b1,"11");
  	p4.add(b2,"32");
  	ActionListener al=new ActionListener(){
  		public void actionPerformed(ActionEvent e){
  			cl.next(p4);
  		}
  	};
  	b1.addActionListener(al);
  	b2.addActionListener(al);
  	
  }

  public static void main(String[] args) {
    YourFrame yourframe = new YourFrame();
    yourframe.show();
  }
}