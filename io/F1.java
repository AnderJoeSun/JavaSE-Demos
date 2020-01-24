import java.io.*;
class F1{
	public static void main(String arg[]) throws Exception{
		File f1=new File("Joyu");
		f1.mkdir();
		File f2=new File("d:\\Javali\\Io\\Joyu\\Joyu.txt");
		f2.createNewFile();
		 
		File fDir=new File(File.separator);//创建D盘为根目录（父目录）。
		String str1="Javali"+File.separator+"Io"+File.separator+"Molyn.txt";
		File f3=new File(fDir,str1);
		f3.createNewFile();
		f3.deleteOnExit();
		Thread.sleep(5000);
		
		
	}
}