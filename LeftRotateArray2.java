import java.util.*;
import java.lang.*;
import java.io.*;

class LeftRotateArray2 {

 
    /* utility function to print an array */
    static void printArray(int arr[], int n)
    {
        System.out.println("Rotated array is:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of testcases you want to run:");
		int t = scan.nextInt();
		while(t!=0){
		    System.out.println("Enter the length of your array:");
		    int n = scan.nextInt();
		    System.out.println("Enter the number of rotations:");
		    int d = scan.nextInt();
		    int arr[] = new int[n];
		    System.out.println("Enter the elements of your array:");
		    for(int i=0; i<n; i++){
		        arr[i] =scan.nextInt();
		    }
		    
		    int arr_temp[]= new int[d];
		    for(int i=0; i<d; i++)
		        arr_temp[i]=arr[i];
		       
		    int j=0;
		    for(int i=d; i<n; i++){
		        arr[j++]=arr[i];
		    }
		    
		    j=0;
		    for(int i=n-d; i<n; i++){
		        arr[i]=arr_temp[j++];
		    }
		    
		    printArray(arr, n);
            t--;
		}
        
    }
}
 