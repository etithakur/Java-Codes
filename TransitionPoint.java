/* Given a sorted array containing only 0s and 1s, find the transition point.*/
import java.util.*;

class TransitionPoint{
		
	static int transition_1(int arr[], int n){
		int count=-1;
		if(arr[n-1]==0)
			return -1;
		if(arr[0]==1)
			return 0;
		for(int i=0; i<n; i++){
			if(arr[i]==0)
				count++;
			else
				break;
		}
		return count+1;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements 0 or 1:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		int index = transition_1(arr, n);
		System.out.println("The index is: "+index);
	}
}