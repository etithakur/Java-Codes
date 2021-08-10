import java.util.*;
class MinMaxArray2{
	
	static class Pair{
		int max;
		int min;
	}
	
	static Pair getMinMax(int arr[], int n){
		Pair minmax = new Pair();
		int i;
		if(n%2==0){
			if(arr[0]>arr[1]){
				minmax.max=arr[0];
				minmax.min=arr[1];
			}
			else{
				minmax.max=arr[1];	
				minmax.min=arr[0];
			}
			i=2;
		}
		else{
			minmax.max=arr[0];
			minmax.min=arr[0];
			i=1;
		}

		while(i<n-1){
			if(arr[i]>arr[i+1]){
				if(arr[i]>minmax.max)
					minmax.max=arr[i];
				else if(arr[i+1]<minmax.min)
					minmax.min=arr[i+1];
			}
			else{
				if(arr[i+1]>minmax.max)
					minmax.max=arr[i+1];
				else if(arr[i]<minmax.min)
					minmax.min=arr[i];
			}
			i+=2;
		}
		return minmax;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		Pair minmax = getMinMax(arr, n);
		System.out.println("Minimum element is: "+minmax.min);
		System.out.println("Maximum element is: "+minmax.max);
	}
}