package SixChapter.clone;

public class Employee implements Cloneable{
	private String name;
	private int age;
	private Address address;
	public Employee(String name,int age,Address address)
	{
		this.name=name;
		this.age=age;
		this.address=address;//可改为 address.clone()再运行Test
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(" name: "+name);
		sb.append(" age: "+age);
		sb.append(" address: "+address);
		return sb.toString();
	}
	
	public Employee clone()
	{
		Employee employee=null;
		try
		{
			employee=(Employee)super.clone();
			employee.address=address.clone();
		}catch(CloneNotSupportedException e) {e.printStackTrace();}
		return employee;
	}
}
