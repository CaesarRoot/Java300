package basic;

import java.math.BigDecimal;

public class bigDecimal {
	public static void main(String[] args)
	{
		BigDecimal sum=new BigDecimal(0.0);     
		BigDecimal factorial=new BigDecimal(1.0);
		int i=1;       
		while(i<=20)
		{
			factorial=factorial.multiply(new BigDecimal(1.0/i));
			sum=sum.add(factorial);
			i++;
		}
		System.out.println(sum);    //BigDecimal���͵����ֿ�������������ĸ����������㣬�ӷ���add��������ʵ�֣��˷���multiply��������ʵ��
	}   //��bigDecimalPlus
}
