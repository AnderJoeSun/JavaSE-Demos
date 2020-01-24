import java.util.*;
import java.io.*;
class P2aa{
	public static void main(String arg[]){
		Properties p=new Properties();
		try{
			p.load(new FileInputStream("Molyn.ini"));
			Enumeration en=p.propertyNames();
			while(en.hasMoreElements()){
				String s1=(String)en.nextElement();
				String s2=p.getProperty(s1);
				System.out.println(s1+"="+s2);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
			
			