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
		System.out.println("������Ҫת�����¶ȣ���λ�����϶ȣ�");
		Scanner in=new Scanner(System.in);
		double celsius=in.nextDouble();
		System.out.println("ת����ɵ��¶ȣ���λ�����϶ȣ�"+CelsiusConverter.getFahrenheit(celsius));     //ֱ�ӵ��þ�̬����
	}
}
