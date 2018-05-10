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
		if(getClass()!=obj.getClass())    //�ж��Ƿ�Ϊͬһ���͵Ķ���
		{
			return false;   
		}
		Equal other=(Equal) obj;        //����һ�п�ʼ�Ƚ�Ҳ�ɵó���ȷ���
		return name.equals(other.name)&&(age==other.age)&&(weight==other.weight);
	}      //�ַ���Ҳ�����ã���equals�Ƚ�
	
	public int hashcode()            //��дhashcode��������A.equals(B)����true������£�A, B ��hashCode()Ҫ������ͬ��ֵ
	{
		int result=17;
		result=result*31+name.hashCode();
		result=result*31+age+(int)weight;
		return result;
	}
	
	public String toString()      //���ڰ�������ʽ���
	{
		StringBuilder sb=new StringBuilder();
		sb.append("����"+name+"\n");
		sb.append("����"+age+"\n");
		sb.append("����"+weight+"\n");
		return sb.toString();
	}
	
	
	
	public static void main(String[] args)
	{
		Equal a=new Equal("one",12,21);
		Equal b=new Equal("two",12,12);
		Equal c=new Equal("one",12,21);
		System.out.println("һ��"+a);
		System.out.println("����"+b);
		System.out.println("����"+c);
		System.out.println("һ�Ŷ����Ƿ���ͬ"+a.equals(b));
		System.out.println("һ�������Ƿ���ͬ"+a.equals(c));
	}
}
