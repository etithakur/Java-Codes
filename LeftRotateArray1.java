import java.util.*;
class LeftRotateArray1 {

   	 static void rotateArray(int[] arr, int n, int d){
	 for(int i=0; i<d; i++)
            		rotateOneByOne(arr, n);
  	  }
    
 	 static void rotateOneByOne(int[] arr, int n){
       		 int temp = arr[0];
		 for(int i=0; i<n-1; i++)
		 	arr[i]=arr[i+1];
		arr[n-1]=temp;
  	  }
    
    	static void printArray(int arr[], int n){
		System.out.println("Rotated array is:");
      		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
    	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of testcases you want to run:");
		int t = scan.nextInt();
		while(t!=0){
		    System.out.println("Enter the length of the array:");
		    int n = scan.nextInt();
		    System.out.println("Enter the number of rotations:");
		    int d = scan.nextInt();
		    int arr[] = new int[n];
		    System.out.println("Enter the elements you want to put in your array:");
		    for(int i=0; i<n; i++){
		        arr[i] = scan.nextInt();
		    }
		    
		    rotateArray(arr,n,d);
		    printArray(arr, n);
		    t--;
		}
	}
}