package basic;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args)
	{
		try
		{
			PrintStream out=System.out;      //����ԭ�����
			PrintStream ps=new PrintStream("E:\\Javakingdom\\Demo2��300��\\Chapter3\\RedirectOutputStream\\RedirectOutputStream.txt");   //�����ļ������
			System.setOut(ps);  //����ʹ���µ������
			int age=18;
			System.out.println("�����������ɹ�����ʼֵΪ18");
			String sex="Ů";
			System.out.println("�Ա��������ɹ�����ʼֵΪŮ");
			String info="���Ǹ�"+sex+"���ӣ�Ӧ����"+age+"���ˡ�";
			System.out.println("������������Ϊinfo�ַ���������������"+info);
			System.setOut(out);     //�ָ�ԭ�������
			System.out.println("����������ϣ���鿴��־�ļ���");
		}catch(FileNotFoundException e) {e.printStackTrace();}
	}
}
