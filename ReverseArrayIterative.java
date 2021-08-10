import java.util.*;
public class ReverseArrayIterative
{
	/* function to reverse the array*/
	static void reverseArray(int arr[], int start, int end) {
		while(start<end){
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
    	}
    
    	public static void main(String args[]) {
      		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the array: ");
      		int arr_length = scan.nextInt();
      		int[] arr = new int[arr_length];
		System.out.println("Enter array items: ");
      		for(int i=0; i<arr_length; i++){
          			arr[i]=scan.nextInt();
      		}

		reverseArray(arr, 0, arr_length-1);

      		/*printing the reversed array*/
		System.out.println("Reversed array elements are: ");
      		for(int i=0; i<arr_length; i++){
        			System.out.print(arr[i]+" ");
      		}
    	}
}
