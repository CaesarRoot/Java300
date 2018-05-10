package SixChapter;

public class Cat {
	private String name;
	private int age;
	private double weight;
	
	public Cat(String name,int age,double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(" name: "+name);
		sb.append(" age: "+age);
		sb.append(" weight: "+weight);
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		Cat cat=new Cat("shits",12,21);
		System.out.println(cat);
	}//println Object时，自动调用toString()
}
