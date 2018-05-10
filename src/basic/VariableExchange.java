package basic;

import java.util.Scanner;

public class VariableExchange {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("输入A的值");
		long A=scan.nextLong();
		System.out.println("输入B的值");
		long B=scan.nextLong();
		System.out.println("A="+A+"\nB="+B);
		System.out.println("执行变量互换");
		A=A^B;        //一个数与另一个数异或两次后变为本身
		B=A^B;
		A=A^B;
		System.out.println("A="+A+"\nB="+B);
	}
}
