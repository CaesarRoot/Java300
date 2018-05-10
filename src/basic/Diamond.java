package basic;

import java.util.Scanner;

public class Diamond {
	int size;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÐÐÊý");
		int size=scan.nextInt();
		printHollowRhombus(size);
	}
	public static void printHollowRhombus(int size)
	{
		if(size%2==0)
		{
			size++;
		}
		int a=size/2;
		for(;a>0;)
		{
			for(int i=0;i<a;i++)
			{
				System.out.print("  ");
			}
		    System.out.print("* ");
		    if(a!=size/2)
		    {
			    for(int j=0;j<2*(size/2-a)-1;j++)
			    {
			    	System.out.print("  ");
			    }
			    System.out.print("* ");
		    }
		    System.out.println();
		    a--;
		}
		System.out.print("* ");
		for(int i=0;i<size-2;i++)
		{
			System.out.print("  ");
		}
		System.out.print("* ");
		System.out.println();
		a++;
		for(;a<=size/2;)
		{
			for(int i=0;i<a;i++)
			{
				System.out.print("  ");
			}
		    System.out.print("* ");
		    if(a!=size/2)
		    {
			    for(int j=0;j<2*(size/2-a)-1;j++)
			    {
			    	System.out.print("  ");
			    }
			    System.out.print("* ");
		    }
		    System.out.println();
		    a++;
		}
	}
}
