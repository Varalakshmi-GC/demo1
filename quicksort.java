package day7;

public class quicksort {

	    static void quickSort(int[] a, int left, int right) {

	        if (left >= right)
	            return;

	        int pivot = a[right];
	        int i = left - 1;

	        for (int j = left; j < right; j++) {

	            if (a[j] < pivot) {
	                i++;

	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }

	        int temp = a[i + 1];
	        a[i + 1] = a[right];
	        a[right] = temp;

	        int pivotIndex = i + 1;

	        quickSort(a, left, pivotIndex - 1);
	        quickSort(a, pivotIndex + 1, right);
	    }

	    public static void main(String[] args) {

	        int[] a = {5, 2, 8, 1, 3};

	        quickSort(a, 0, a.length - 1);

	        for (int x : a) {
	            System.out.print(x + " ");
	        }
	    }
	}
