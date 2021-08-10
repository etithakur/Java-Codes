/* Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
*/
import java.util.*;

class Equilibrium{
	
	static void findEquilibrium(int arr[], int n){
		int sum=0, leftSum=0, flag=0;
		for(int i=0; i<n; i++)
			sum+=arr[i];
		
		for(int i=0; i<n; i++){
			sum=sum-arr[i];
			if(leftSum==sum){
				System.out.print("The equilibrium point is: "+i);
				flag=1;
				break;
			}
			leftSum+=arr[i];
		}
		if(flag==0)
			System.out.print("Equilibrium point does not exist.");
	}	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		findEquilibrium(arr, n);
	}
}