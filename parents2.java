package day2;

public final class parents2 {
	class Parent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}

	public class Demo extends Parent{

		public static void main(String[] args) {
	 		Demo  bb= new Demo();
	 		bb.bp();
	 		bb.cancer();
		}
	}
}
