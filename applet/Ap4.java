import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Ap4 extends Applet{
	public void init(){
    System.out.println("Init");
    Button b=new Button("打开新的");
    add(b);
    b.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		try{
    		getAppletContext().showDocument(new 
    	            URL("http://www.baidu.com/"),"_blank");
    	            
    	  }catch(Exception ex){
    	     	ex.printStackTrace();
    	  }
    	}
    });
  }
}