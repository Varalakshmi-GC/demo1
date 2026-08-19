package day2;

public class grandparents5 {
	class GrandParent
	{
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}
	class Parent extends GrandParent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
	}
	public class Demo extends GrandParent,Parent{

		public static void main(String[] args) {
	 		Demo  bb= new Demo();
	 		bb.bp();
	  // 	bb.cancer();
		}
	}


}
