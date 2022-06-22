
public class QuickSort {
	public static void main(String[] args) {
		int [] array={8,4,6,3,9,7,1,5};
		System.out.println("Before ");
		for (int i : array) {
			System.out.print(i +",");
		}
		System.out.println();
		sort(array,0,array.length-1);
		System.out.println("After ");
		for (int i : array) {
			System.out.print(i +",");
		}
		System.out.println();
	}

	private static void sort(int[] array, int low, int high) {
		if(low>=high)
			return;
		int pivot=array[high];
		int leftpointer = partition(array, low, high,pivot);

		sort(array,low,leftpointer-1);
		sort(array,leftpointer+1,high);
	}

	private static int partition(int[] array, int low, int high,int pivot) {
		
		int leftpointer=low;
		int rightpointer=high-1;
		
		while(leftpointer<rightpointer){
			 // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
			while(array[leftpointer]<=pivot && leftpointer <rightpointer){
				leftpointer++;
			}
			  // Walk from the right until we find a number less than the pivot, or hit the left pointer.
			while(array[rightpointer]>=pivot && leftpointer<rightpointer){
				rightpointer--;
			}
			//left is at high element and right is at small element 
			swap(array, leftpointer, rightpointer);
		}
		
		// swap pivot and left pointer where left pointer = right pointer 
		// this will get the pivot in middle 
		if(array[leftpointer]>array[high]){
			swap(array,leftpointer,high);
		}
		
		
		return leftpointer;
	}

	private static void swap(int[] array, int leftpointer, int rightpointer) {
		int temp=array[leftpointer];
		array[leftpointer]=array[rightpointer];
		array[rightpointer]=temp;
	}

}
