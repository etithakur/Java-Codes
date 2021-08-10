import java.util.*;

class KSmallest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int n = scan.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		System.out.println("Enter the value of k:");
		int k = scan.nextInt();
		Arrays.sort(arr);
		System.out.println("The k-th smallest element in the array is:");
		System.out.println(arr[k-1]); 
	}
}