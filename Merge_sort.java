public class Merge_sort
{
	int arr[];
	int tempMergeArr[];
	int length;
	public static void main(String arg[]){
		int inputArr[] = {48,36,13,52,19,94,21};
		Merge_sort ms = new Merge_sort();
		ms.sort(inputArr);
		
		for(int i:inputArr)
		{
			System.out.print(i+" ");
		}
		
	}
	public void sort(int inputArr[])
	{
		this.arr = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArr(0,length-1);
	}
	public void divideArr(int lowerindex,int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middle = lowerindex+(higherindex-lowerindex)/2;
			//it will sort the left side of an array
			divideArr(lowerindex,middle);
			
			//it will sort the right side of an array
			divideArr(middle+1,higherindex);
			
			mergeArr(lowerindex,middle,higherindex);
		}
	}
	public void mergeArr(int lowerindex,int middle,int higherindex)
	{
		for(int i=lowerindex;i<=higherindex;i++)
		{
			tempMergeArr[i]=arr[i];
		}
		int i = lowerindex;
		int j = middle+1;
		int k = lowerindex;
		while(i<=middle && j<=higherindex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				arr[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				arr[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			arr[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
}
	
	




	