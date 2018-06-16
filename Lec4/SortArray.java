package Assignment4;

public class SortArray {

	public static void main(String[] args) {
		int arr[]={1,1,1,1,0,0,1,0};
		int temp,j;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
