package basic;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������: ");
		Long number=scan.nextLong();     //���ڶ�ȡ��������
		String check=(number%2==0)?"���Ǹ�������ż��":"�������������";
		System.out.println(check);
	}
}
