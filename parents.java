package day2;

public class parents {
	package ababd;

	class Parents {
		private int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

	public class Dmeo extends Parents {

		public static void main(String[] args) {
			Dmeo test = new Dmeo();// object
			test.setA(11);
			int aa = test.getA();
			System.out.println(aa);
		}
	}

}
