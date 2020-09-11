package code;

public class SortingMain {
	public static void main(String[] args) {
		int[] arr = {5, 4, 2, 6, 3, 1};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		System.out.println("----------------");
		
		selectionSortDescending(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	// ascending
	public static void selectionSort(int[] arr) {
		// select i th element
		for (int i = 0; i < arr.length; i++) {
			// compare selected element with all elements after that
			for (int j = i+1; j < arr.length; j++) {
				// if i th element > j th element, swap them
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	// descending
	public static void selectionSortDescending(int[] arr) {
		// select i th element
		for (int i = 0; i < arr.length; i++) {
			// compare selected element with all elements after that
			for (int j = i+1; j < arr.length; j++) {
				// if i th element > j th element, swap them
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}