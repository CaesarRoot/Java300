package basic;

import java.util.Scanner;

public class ArrayMinValue {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������");
		String arrayStr=scan.nextLine().trim();   //ȥ�����˿ո�
        String[] numStrs=arrayStr.split(" {1,}"); //������һ���ո�ָ���
        int[] numArray=new int[numStrs.length];
        for(int j=0;j<numStrs.length;j++)
        {
        	numArray[j]=Integer.valueOf(numStrs[j]);   //StringתΪint�����ǲ����г�������������ַ�
        }
        int min=numArray[0];
        for(int i=0;i<numArray.length;i++)
        {
        	if(min>numArray[i])
        		min=numArray[i];
        }
        System.out.println("��С������"+min);
	}
}
