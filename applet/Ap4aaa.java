import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.URL;

public class Ap4aaa extends Applet{
	public void init(){
		Button b=new Button("Baidu");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
				  URL u=new URL("http://www.baidu.com/");
				  getAppletContext().showDocument(u,"_blank");
			  }catch(Exception ex){
				  ex.printStackTrace();
			  }
			}
		});
		add(b,"Center");
		
		
	}
}