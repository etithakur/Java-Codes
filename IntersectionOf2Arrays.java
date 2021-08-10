import java.util.*;

class IntersectionOf2Arrays{

	static void intersectionArray(int a[], int b[], int n, int m){
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0, j=0, flag=0;
		while( i<n && j<m){
			if(a[i]==b[j]){
				System.out.print(a[i]+" ");
				flag=1;
				i++;
				j++;
			}
			else if(a[i]>b[j])
				j++;
			else
				i++;
		}
		if(flag==0)
			System.out.println("No common elements.\n");
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array 1:");
		int n = scan.nextInt();
		System.out.println("Enter array 1 elements:");
		int arr1[] = new int[n];
		for(int i=0; i<n; i++)
			arr1[i] = scan.nextInt();

		System.out.println("Please enter the length of array 2:");
		int m = scan.nextInt();
		System.out.println("Enter array 2 elements:");
		int arr2[] = new int[m];
		for(int i=0; i<m; i++)
			arr2[i] = scan.nextInt();


		intersectionArray(arr1, arr2, n, m);
	}
}