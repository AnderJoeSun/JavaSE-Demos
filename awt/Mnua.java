import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Mnua{
	public static void main(String arg[]){
		final Frame f=new Frame("Joyu Loves Molyn!");
		f.setSize(600,400);
		f.setLocation(200,100);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		final TextArea ta=new TextArea();
		f.add(ta);
		MenuBar mb=new MenuBar();
		
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		mi2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				FileDialog fd=new FileDialog(f,"Open Files",FileDialog.LOAD);
				fd.show();
				String s=fd.getDirectory()+fd.getFile();
				if(s!=null){
					try{
					FileInputStream fis=new FileInputStream(s);
					byte[] b=new byte[10*1024];
					int len=fis.read(b);
					ta.append(new String(b,0,len));
				  }catch(Exception es){
				  	es.printStackTrace();
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
		MenuItem mi6=new Menu("Paste");
		
		mb.add(m1);
	  mb.add(m2);
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		
		f.setMenuBar(mb);
		f.show();
	}
}