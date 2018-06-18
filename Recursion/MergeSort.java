package Recursion;
public class MergeSort {
	public static void sort(int []arr) {
		if(arr.length == 1) {
			return;
		}
		    int mid = arr.length / 2;
		    int [] left= new int[mid];
		    int right [] = new int[arr.length - mid];
		    
		    for(int i = 0; i < left.length ;i++) {
		    	left[i] = arr[i];
		    }
		    for(int i = 0; i < right.length;i++) {
		    	right[i] = arr[i + mid];
		    }
		    sort(left);
		    sort(right);
		    merge_Arrays(left,right,arr);
	}
	private static void merge_Arrays(int[] left, int[] right, int[] arr) {
	     
		int i =0, j = 0 , k = 0;
		
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while( i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int [] arr = {0,2,3,1,4};
		sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
