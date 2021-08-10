import java.util.*;

class ReverseArrayInGroups{
	
	static void rotate(int arr[], int start, int end){
		while(start<end){
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	static void reverseInGroup(int arr[], int n, int k){
		int i=0;
		while(i<n){
			if(i+k < n)
				rotate(arr, i, i+k-1);
			else
				rotate(arr, i, n-1);
			i=i+k;
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
		System.out.println("Enter the value of k: ");
		int k = scan.nextInt();

		reverseInGroup(arr, n, k);
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}
}