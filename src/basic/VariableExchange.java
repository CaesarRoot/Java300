package basic;

import java.util.Scanner;

public class VariableExchange {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("����A��ֵ");
		long A=scan.nextLong();
		System.out.println("����B��ֵ");
		long B=scan.nextLong();
		System.out.println("A="+A+"\nB="+B);
		System.out.println("ִ�б�������");
		A=A^B;        //һ��������һ����������κ��Ϊ����
		B=A^B;
		A=A^B;
		System.out.println("A="+A+"\nB="+B);
	}
}
