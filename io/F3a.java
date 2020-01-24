import java.io.*;
class F3a{
	public static void main(String arg[]){
		File dir=new File(File.separator);
		String s="javali"+File.separator+"io";
		File f=new File(dir,s);
		String[] s1=f.list();
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
		
		String[] s2=f.list(new FilenameFilter(){
			public boolean accept(File dir,String name){
				return name.indexOf(".java")!=-1;
			}
		});
		System.out.println("\tJava!");
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
	}
}