public class Str2aaa{
	public static void main(String arg[]){
		StringBuffer sb=new StringBuffer();
		sb.append("jsdflks").append("kdj;s").append("dfs");
		System.out.println(sb);
		sb.delete(3,5);
		System.out.println(sb);
		sb.insert(5,"jsdfk");
		System.out.println(sb);
		
		String[] str=new String[]{"a","b","c"};
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
		
		
	}
}

