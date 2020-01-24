import java.io.*;
class F1a{
	public static void main(String arg[]) throws Exception{
		File f=new File("Joyu");
		f.mkdir();
		File f2=new File("d:\\Javali\\Io\\Joyu\\Joyu.txt");
		f2.createNewFile();
		
		File dir=new File(File.separator);
		String s="Javali"+File.separator+"Io"+File.separator+"Joyu.txt";
		File f3=new File(dir,s);
		f3.createNewFile();
		f3.deleteOnExit();
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}