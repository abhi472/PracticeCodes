package coreman;

import java.util.Scanner;

public class InsertionSort {
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int arr[] ;
		System.out.println("enter the num");
		int a = s.nextInt();
		arr = new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("before sort ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("after sort ");
		arr = Isort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}

	public static int[] Isort(int[] arr)
	{
		int key;
		int i,j;
		
		for(i = 1;i < arr.length;i++)
		{
			key = arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
	}
		
		return arr;

}
}
