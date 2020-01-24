import java.io.*;

public class F3aaa{
	public static void main(String arg[]) throws Exception{
	  File dir=new File(File.separator);
	  String str1="javali"+File.separator+"io";
	  File f1=new File(dir,str1);
	  String[] str2=f1.list(new FilenameFilter(){
	  	public boolean accept(File dir,String name){
	  		return name.indexOf("java")!=-1;
	  	}
	  }
	  );
	  
	  for(int i=0;i<str2.length;i++){
	  	System.out.println(str2[i]);
	  }
	}
}
		