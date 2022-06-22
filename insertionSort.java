
public class insertionSort {
	public static void main(String[] args) {
		int[] arr={7,8,3,1,2};
		//find smallest elemnt positiona nd then swap with i 
		int n = arr.length;
		for(int i=1;i<n;i++){
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[current]<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
			}
			
	}
}
