package SixChapter;

public class Equal {
	private String name;
	private int age;
	private double weight;
	
	public Equal(String name,int age,double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj==null)
		{
			return false;
		}
		if(getClass()!=obj.getClass())    //判断是否为同一类型的对象
		{
			return false;   
		}
		Equal other=(Equal) obj;        //从这一行开始比较也可得出正确结果
		return name.equals(other.name)&&(age==other.age)&&(weight==other.weight);
	}      //字符串也是引用，用equals比较
	
	public int hashcode()            //重写hashcode方法，在A.equals(B)返回true的情况下，A, B 的hashCode()要返回相同的值
	{
		int result=17;
		result=result*31+name.hashCode();
		result=result*31+age+(int)weight;
		return result;
	}
	
	public String toString()      //用于按给定格式输出
	{
		StringBuilder sb=new StringBuilder();
		sb.append("姓名"+name+"\n");
		sb.append("年龄"+age+"\n");
		sb.append("体重"+weight+"\n");
		return sb.toString();
	}
	
	
	
	public static void main(String[] args)
	{
		Equal a=new Equal("one",12,21);
		Equal b=new Equal("two",12,12);
		Equal c=new Equal("one",12,21);
		System.out.println("一号"+a);
		System.out.println("二号"+b);
		System.out.println("三号"+c);
		System.out.println("一号二号是否相同"+a.equals(b));
		System.out.println("一号三号是否相同"+a.equals(c));
	}
}
