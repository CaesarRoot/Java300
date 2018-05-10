package basic;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		Long number=scan.nextLong();     //用于读取整形数据
		String check=(number%2==0)?"这是个数字是偶数":"这个数字是奇数";
		System.out.println(check);
	}
}
