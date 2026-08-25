package day6;

public class sorting {
public static void main(string[]args) {
	int[]numbers= {3,1,2,4};
	int left = 0;
	int right = numbers.length - 1;
	while (left<right) {

		int temp = numbers[left];
		numbers[left]=numbers[right];
		numbers[right]=temp;
		left++;
		right--;
	}
	System.out.println("Rearranged array:");
	for(int i=0;i< numbers.length;i++) {
		System.out.println(numbers[i]+"");
	}
}
}
