package basic;

import java.math.BigDecimal;

public class bigDecimalPlus {
	public static void main(String[] args)
	{
		BigDecimal a=new BigDecimal("2.0");   //加减乘除操作
	    BigDecimal b=new BigDecimal("3.0");
	    BigDecimal c;
	    c=a.add(b);
	    System.out.println(c);
	    c=a.subtract(b);
	    System.out.println(c);
	    c=a.multiply(b);
	    System.out.println(c);
	    c=a.divide(b,20,BigDecimal.ROUND_HALF_DOWN);  //指定位数和取舍方式
	    System.out.println(c);
	    
	    BigDecimal A=new BigDecimal(1.22);
	    BigDecimal B=new BigDecimal("1.22");   //两者不相等
	    System.out.println(A);  //原因在于1.22不能表示为任何有限长度的二进制小数
	    System.out.println(B);  //最好用String来构造
	}       
}