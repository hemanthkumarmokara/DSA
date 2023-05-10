 
import java.util.*;

class bubbleSort {
	void bbubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
 
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		bubbleSort ob = new bubbleSort();
		int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("unsorted array");
		ob.printArray(arr);
		ob.bbubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
} 
