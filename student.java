package day6;

public class student {
		public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 70};

        int[] prefixsum = new int[marks.length];

        prefixsum[0] = marks[0];

        for (int i = 1; i < marks.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + marks[i];
        }

        int sum = prefixsum[4] - prefixsum[0];

        System.out.println("Total marks = " + sum);
    }
}

