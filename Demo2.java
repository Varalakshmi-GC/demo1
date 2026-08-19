package day2;

public class Demo2 {
	class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class Dmeo extends Parents {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			Dmeo test = new Dmeo();// object
			test.marry();
			test.property();
		
		}
	}
}
	

