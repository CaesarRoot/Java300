package basic;

import java.math.BigDecimal;

public class bigDecimalPlus {
	public static void main(String[] args)
	{
		BigDecimal a=new BigDecimal("2.0");   //�Ӽ��˳�����
	    BigDecimal b=new BigDecimal("3.0");
	    BigDecimal c;
	    c=a.add(b);
	    System.out.println(c);
	    c=a.subtract(b);
	    System.out.println(c);
	    c=a.multiply(b);
	    System.out.println(c);
	    c=a.divide(b,20,BigDecimal.ROUND_HALF_DOWN);  //ָ��λ����ȡ�᷽ʽ
	    System.out.println(c);
	    
	    BigDecimal A=new BigDecimal(1.22);
	    BigDecimal B=new BigDecimal("1.22");   //���߲����
	    System.out.println(A);  //ԭ������1.22���ܱ�ʾΪ�κ����޳��ȵĶ�����С��
	    System.out.println(B);  //�����String������
	}       
}