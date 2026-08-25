package day5;

public class demo4 {
		public static void main(String[] args) {
			String text="I love java programming";
			String pattern="java";
			int position =search(text,pattern);
			if(position !=-1) {
				System.out.println("pattern found at index:"   +position);
				
			}else {
				System.out.println("pattern not found");
				int n=text.length();
				int m=pattern.length();
				for(int i=0;i<=n-m;i++) {
					int j;
					for(j=0;j<m;j++) {
						if(text.charAt(i+j)!=pattern.charAt(j)) {
							break;
						}
					}
					if(j==m) {
						return i;
						
					}
				}
				return-1;
				
			}
		}


}
