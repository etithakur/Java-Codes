import java.util.*;
 class MinMaxArray0{
	static class Pair{
		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int n){
		Pair minmax = new Pair();
		if(n==1){
			minmax.max=arr[0];
			minmax.min=arr[0];
			return minmax;
		}
		if(arr[0]>arr[1]){
			minmax.max=arr[0];
			minmax.min=arr[1];
		}
		else{
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(int i=2; i<n; i++){
			if(arr[i]>minmax.max)
				minmax.max=arr[i];
			else if(arr[i]<minmax.min)
				minmax.min=arr[i];
		}
		return minmax;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		Pair minmax = getMinMax(arr, n);
		System.out.println("Minimum element is: "+ minmax.min);
		System.out.println("Maximum element is: "+minmax.max);
		
	}
}