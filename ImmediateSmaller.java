/* Given an array arr[] of size N containing positive integers and an integer X, find the element in the array which is smaller than X and closest to it.
*/
import java.util.*;

class ImmediateSmaller{

	static int findImmediateSmaller(int arr[], int n, int x){
		int smaller=-1;
		for(int i=0; i<n; i++){
			if(smaller<arr[i] && arr[i]<x)
				smaller=arr[i];
		}
		return smaller;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter x:");
		int x = scan.nextInt();
		int result = findImmediateSmaller(arr, n, x);
		System.out.println("Immediate smaller number to x is: "+result);
	}
}