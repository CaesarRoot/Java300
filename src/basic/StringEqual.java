package basic;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("����Hello world");
		String s=scan.nextLine();
		if(s.equals("Hello world"))     //�ж��ַ����Ƿ����Ҫ��equal������==
		{
			System.out.println("������ȷ");
		}
		else
		{
			System.out.println("�������");
		}
	}
}
