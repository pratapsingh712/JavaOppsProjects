package array;

import java.util.Scanner;

public class UniqueElements {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		String res = "";
		
		int count = 1;
		
		for(int i=0;i<array.length;i++)
		{
			count = 1;
			
			if(array[i]!=-1)
			{
				for(int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						array[i] = -1;
						array[j] = -1;
						count++;
					}
				}
				
				if(count<=1)
				{
					res += array[i]+" ";
				}
			}
		}
		
		System.out.println(res);
		
		sc.close();
	}

}
