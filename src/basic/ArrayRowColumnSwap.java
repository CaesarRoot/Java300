package basic;

import java.util.Scanner;

public class ArrayRowColumnSwap {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�������к��У���������������");
		String in=scan.nextLine().trim();
		String[] a=in.split(" ");          //�ÿո�ֿ�
		int[] b=new int[a.length];
		int row=Integer.valueOf(a[0]);     //ȡ���к���
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
		System.out.println("���л���ǰ");
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
		System.out.println("���л�����");
		printArray(c);
	}
	public static void printArray(int[][] a)   //���Զ���ָ������
	{
		for(int i=0;i<a.length;i++)            //�����Զ���ȡ�к��У�����Ҫ�������
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
