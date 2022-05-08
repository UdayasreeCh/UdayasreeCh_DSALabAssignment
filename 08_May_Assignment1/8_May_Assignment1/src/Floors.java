import java.io.*;
import java.util.Scanner;

public class Floors {
	public static void main(String[] Args)
	{
	
	int n;
    Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the No of Floors:");
		n = Sc.nextInt();
		int max = n;

int[] array = new int[n];
int[] array1 = new int[n];
int ind=0;

for (int i=0;i<n;i++) {
	System.out.println("enter the floor size given on day: "+ i);
			array[i]=Sc.nextInt();
				
			}

for (int j=0;j < n-1;i++)
{
	ind = array[j];

array1[ind] = ind;
		
		if (ind == max)
		{
			while(array1[ind]!=0)
			{
				System.out.print(" "+ array1[ind]);
				ind--;
			}
			max = ind;
			System.out.println(" ");
		}
		else {
			System.out.println(" ");
		}
}


	}
}

	
