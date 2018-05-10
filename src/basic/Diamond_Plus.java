package basic;

import java.util.Scanner;

public class Diamond_Plus {
	int size;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("«Î ‰»Î–– ˝");
		int size=scan.nextInt();
		printHollowRhombus(size);
	}
	public static void printHollowRhombus(int size)
	{
		if(size%2==0)
		{
			size++;
		}
		for(int i=0;i<size/2+1;i++)
		{
			for(int j=size/2+1;j>i+1;j--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				if(j==0||j==2*i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=size/2-1;i>=0;i--)
		{
			for(int j=size/2+1;j>i+1;j--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				if(j==0||j==2*i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
