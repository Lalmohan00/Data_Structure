import java.util.*;
class Insertion_sort
{
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int arr[]={2,5,8,4,6,9,3};
		for(int i=0;i<arr.length;i++){
			int current = arr[i];
			int j = i-1;
			while(j>= 0 && current < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			//placement
			arr[j+1] = current;
		}
		printArray(arr);
	}
}