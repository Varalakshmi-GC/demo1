package day11;

public class demo5 {
public static void main(String[]args) {
	int [][] matrix= {
			{1,2,3},
			{4,5,6}
	};
	System.out.println("Tranpose:");
	for(int j=0;j<2;j++) {
		for(int i =0;i<2;i++) {
			System.out.println(matrix[i][j]+" ");
		}
		System.out.println( );
	}
}
}
