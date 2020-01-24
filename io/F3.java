import java.io.*;
class F3{
	public static void main(String arg[]) throws Exception{
		File f1=new File(File.separator);
		String str1="Javali"+File.separator+"Io";
		File f2=new File(f1,str1);
		String[] s=f2.list();
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		String[] s1=f2.list(new FilenameFilter(){
			public boolean accept(File dir,String name){
				return name.indexOf(".java")!=-1;
			}
		}
			
		);
		for(int i=0;i<s1.length;i++){
			System.out.println(s[i]);
		}
	}
}