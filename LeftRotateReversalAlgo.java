import java.util.*;

class LeftRotateReversalAlgo{
	static void rotateArray(int arr[], int d, int n){
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
	}
	static void reverseArray(int arr[], int start, int end){
		if(start>end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArray(arr, start+1, end-1);
	}

	static void printArray(int arr[], int n){
		System.out.println("Rotated array is:");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of testcases you want to run:");
		int t = scan.nextInt();
		while(t!=0){
		System.out.println("Enter the length of your array:");
		int n = scan.nextInt();
		System.out.println("Enter the number of rotations:");
		int d = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements that you want to put in your array:");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		rotateArray(arr, d, n);
		printArray(arr, n);
		t--;
		}
	}
}