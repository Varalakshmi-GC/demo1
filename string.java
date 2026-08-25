package day6;

public class string {
		public static void main(String[] args) {
			int[] marks= {70,80,60,90};
			int currentmarks=0;
			int bestmarks=0;
			for(int i=0;i<marks.length;i++) {
				currentmarks=currentmarks +marks[i];
				if(currentmarks<0) {
					currentmarks=0;
					
				}
				if(currentmarks>bestmarks) {
					bestmarks=currentmarks;
				}
			}
			System.out.println("maximum marks="+ bestmarks);
		}
	}
