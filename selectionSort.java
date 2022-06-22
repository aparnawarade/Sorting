
public class selectionSort {
	public static void main(String[] args) {
		int[] arr={7,8,3,1,2};
		//find smallest elemnt positiona nd then swap with i 
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			int small=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[small]){
					small=j;
				}
			}
				int temp=arr[small];
				arr[small]=arr[i];
				arr[i]=temp;
			
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
			}
			
	}
}
