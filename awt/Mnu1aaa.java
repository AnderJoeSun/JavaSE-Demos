import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Mnu1aaa{
	public static void main(String arg[]){
		final Frame f=new Frame("Joyu");
		f.setSize(700,400);
		f.setLocation(100,100);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		final TextArea ta=new TextArea();
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		mi2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileDialog fd=new FileDialog(f,"Open!",FileDialog.LOAD);
				fd.show();
				String str=fd.getFile();
				if(str!=null){
					try{
						FileInputStream fis=new FileInputStream(str);
					  byte[] b=new byte[10000];
					  int len=fis.read(b);
					  ta.setText(new String(b,0,len));
					}catch(Exception ex){
						ex.printStackTrace();
					}
				}
			}
		});
		MenuItem mi3=new MenuItem("Save");
		MenuItem mi4=new MenuItem("Exit");
		mi4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		MenuItem mi5=new MenuItem("Copy");
		MenuItem mi6=new MenuItem("Paste");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);
		f.add(ta);
		f.show();
			
	}
}