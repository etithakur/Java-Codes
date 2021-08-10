/* Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 
*/
import java.util.*;

class Leaders{

	static void findLeaders(int arr[], int n){
		int max=arr[n-1];

		System.out.print("Leaders are:\n"+max+" ");
		for(int i=n-2; i>=0; i--){
			if(arr[i]>max){
				System.out.print(arr[i]+" ");
				max=arr[i];
			}
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
		findLeaders(arr, n);
	}
}