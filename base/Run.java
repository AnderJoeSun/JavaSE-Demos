class Run{
  public static void main(String agr[]){
  	Runtime rt=Runtime.getRuntime();
  	System.out.println(rt.freeMemory());
  	System.out.println(rt.totalMemory());
  }
}