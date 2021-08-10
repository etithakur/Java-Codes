import java.util.*;

class MinMaxArray1{
	static class Pair{
		int min;
		int max;
	}
	static Pair getMinMax(int arr[], int low, int high){
		Pair minmax= new Pair();
		Pair mml, mmr;
		if(low==high){
			minmax.max=arr[low];
			minmax.min=arr[low];
			return minmax;
		}
		if(low+1==high){
			if(arr[low]>arr[high]){
				minmax.max=arr[low];
				minmax.min=arr[high];
			}
			else{
				minmax.max=arr[high];
				minmax.min=arr[low];
			}
			return minmax;
		}
		int mid=(low+high)/2;
		mml=getMinMax(arr, low, mid-1);
		mmr=getMinMax(arr, mid, high);

		//Comparing minimums
		if(mml.min>mmr.min)
			minmax.min=mmr.min;
		else
			minmax.min=mml.min;

		//Comparing maximums
		if(mml.max>mmr.max)
			minmax.max=mml.max;
		else
			minmax.max=mmr.max;

		return minmax;

	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();
		Pair minmax = getMinMax(arr, 0, n-1);
		System.out.println("Minimum element is: "+minmax.min);
		System.out.println("Maximum element is: "+minmax.max);
	}
}