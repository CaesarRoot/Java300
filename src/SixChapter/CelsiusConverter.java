package SixChapter;

import java.util.Scanner;

public class CelsiusConverter {
	public static double getFahrenheit(double celsius)
	{
		double fahrenheit=1.8*celsius+32;
		return fahrenheit;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("请输入要转换的温度（单位：摄氏度）");
		Scanner in=new Scanner(System.in);
		double celsius=in.nextDouble();
		System.out.println("转换完成的温度（单位：华氏度）"+CelsiusConverter.getFahrenheit(celsius));     //直接调用静态方法
	}
}
