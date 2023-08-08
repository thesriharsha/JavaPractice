package day6;


public class GreaterAndLesser50 {
	public static void main(String[] args)
	{
		long[] arr = new long[10];
		
		long[] b = new long[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Math.round(Math.random()*100);
		}
		System.out.println("Numbers less than 50 are");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<50)
			{
				System.out.print(arr[i]+" ");
			}
			else {
				b[j++] = arr[i];
			}
		}
		System.out.println("\nNumbers greater than 50 are");
		for(int i=0;i<j;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
