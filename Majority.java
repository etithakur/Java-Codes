/* Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array, x or y. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.
*/

import java.util.*;


class Majority{

	static int findMajority(int arr[], int n, int x, int y){
		int countx=0, county=0;
		for(int i=0; i<n; i++){
			if(arr[i]==x)
				countx++;
			else if(arr[i]==y)
				county++;
		}
		if(countx>county)
			return x;
		else if(county>countx)
			return y;
		else
			return Math.min(x, y);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		System.out.println("Enter the value of x: ");
		int x = scan.nextInt();
		System.out.println("Enter the value of y: ");
		int y = scan.nextInt();
		int result = findMajority(arr, n, x, y);
		System.out.println("The result is: "+result);
	}
}