class Lj{
	
		int hao;
		static int count;
		Lj(){
			count++;
			System.out.println("object "+count+" is created");
			set(count);
		}
		void set(int id){
			hao=id;
		}
		protected void finalize(){
			System.out.println("object "+hao+" is reclained");
		}
		public static void main(String arg[]){
		  new Lj();System.gc();
		  new Lj();System.gc();
		  new Lj();System.gc();
		  new Lj();
		  System.gc();
	  }
}

		