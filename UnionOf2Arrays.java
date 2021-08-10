import java.util.*;

class UnionOf2Arrays{

	static void unionArray(int a[], int b[], int n, int m){
		int i=0, j=0;
		int arr[] = new int[m+n];
		int p=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<n && j<m){
			if(a[i]>b[j] && p>0 && arr[p-1]==b[j])
				j++;
			else if(a[i]<b[j] && p>0 && arr[p-1]==a[i])
				i++;
			else if(a[i]>b[j]){
				arr[p++]=b[j++];
			}
			else if(a[i]<b[j]){
				arr[p++]=a[i++];
			}
			else{
				arr[p++]=b[j++];
				i++;
			}
		}

		while(i<n){
			if(a[i]==arr[p-1])
				i++;
			else
				arr[p++]=a[i++];
		}
		while(j<m){
			if(b[j]==arr[p-1])
				j++;
			else
				arr[p++]=b[j++];
		}

		for(i=0; i<arr.length; i++){
			if(arr[i]!=0)
			System.out.print(arr[i]+" ");
		}
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


		unionArray(arr1, arr2, n, m);
	}
}