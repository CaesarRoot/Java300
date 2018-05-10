package basic;

import java.util.Scanner;

public class InputCode {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);   //用到了System类的输入流in，用以接收用户信息。Scanner类是Java的扫描器类可以从输入流中读取指定类型的数据或字符串
		System.out.println("请输入你的QQ号: ");
		String line=scanner.nextLine();
		System.out.println("你的QQ号是"+line.length()+"位数的");
	}
}
