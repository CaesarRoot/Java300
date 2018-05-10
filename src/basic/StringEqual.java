package basic;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("输入Hello world");
		String s=scan.nextLine();
		if(s.equals("Hello world"))     //判断字符串是否相等要用equal不能用==
		{
			System.out.println("输入正确");
		}
		else
		{
			System.out.println("输入错误");
		}
	}
}
