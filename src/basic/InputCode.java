package basic;

import java.util.Scanner;

public class InputCode {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);   //�õ���System���������in�����Խ����û���Ϣ��Scanner����Java��ɨ��������Դ��������ж�ȡָ�����͵����ݻ��ַ���
		System.out.println("���������QQ��: ");
		String line=scanner.nextLine();
		System.out.println("���QQ����"+line.length()+"λ����");
	}
}
