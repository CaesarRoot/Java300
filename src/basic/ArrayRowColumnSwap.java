package basic;

import java.util.Scanner;

public class ArrayRowColumnSwap {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入行和列，并依次输入数组");
		String in=scan.nextLine().trim();
		String[] a=in.split(" ");          //用空格分开
		int[] b=new int[a.length];
		int row=Integer.valueOf(a[0]);     //取得行和列
		int column=Integer.valueOf(a[1]);
		for(int i=0;i<a.length-2;i++)
		{
			b[i]=Integer.valueOf(a[i+2]);
		}
		int[][] c=new int[row][column];
		int k=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				c[i][j]=b[k];
				k++;
			}
		}
		System.out.println("行列互换前");
		printArray(c);
		int temp;
		for(int i=0;i<row;i++)
		{
			for(int j=i;j<row;j++)
			{
				temp=c[j][i];
				c[j][i]=c[i][j];
				c[i][j]=temp;
			}
		}
		System.out.println("行列互换后");
		printArray(c);
	}
	public static void printArray(int[][] a)   //可以都不指定长度
	{
		for(int i=0;i<a.length;i++)            //可以自动获取行和列，不需要额外参数
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
