package day3;

public class WrapperDemo {
	public static void main(String[] args) {
		
	int a=20;
	System.out.println("primitive value: "+a);
	Integer b =20;
	System.out.println("wrapper value"+b);
	int x =30;
	Integer y=x;
	System.out.println("Autoboxing:"+y);
	Integer  p=40;
	int q =p;
	System.out.println("unboxing:"+q);
}
}