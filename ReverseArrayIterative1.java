import java.util.*;

public class ReverseArrayIterative1{
	
	/*function to reverse the array*/
	static void reverseArray(int arr[], int n){
		System.out.println("Reversed array is: ");
		for(int i=n-1; i>=0; i--)
			System.out.print(arr[i]+" ");
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int arr_length = scan.nextInt();
		int[] arr = new int[arr_length];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr_length; i++)
			arr[i] = scan.nextInt();
		
		reverseArray(arr, arr_length);
	}
}