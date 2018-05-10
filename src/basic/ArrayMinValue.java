package basic;

import java.util.Scanner;

public class ArrayMinValue {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一串数字");
		String arrayStr=scan.nextLine().trim();   //去除两端空格
        String[] numStrs=arrayStr.split(" {1,}"); //以至少一个空格分隔开
        int[] numArray=new int[numStrs.length];
        for(int j=0;j<numStrs.length;j++)
        {
        	numArray[j]=Integer.valueOf(numStrs[j]);   //String转为int，但是不能有除了数字以外的字符
        }
        int min=numArray[0];
        for(int i=0;i<numArray.length;i++)
        {
        	if(min>numArray[i])
        		min=numArray[i];
        }
        System.out.println("最小的数是"+min);
	}
}
