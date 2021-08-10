import java.util.*;

class WaveArray{

	static void rotate(int arr[], int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
 		arr[end] = temp;
	}
	static void formWave(int arr[], int n){
		int i=0; 
		while(i<n){
			if(i+2<n)
				rotate(arr, i, i+1);
			i+=2;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		formWave(arr, n);
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}