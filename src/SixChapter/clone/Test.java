package SixChapter.clone;

public class Test {
	public static void main(String[] args)
	{
		Address address=new Address("中国","吉林","长春");
		Employee employee1=new Employee("张三",30,address);
		System.out.println("员工1的信息");
		System.out.println(employee1);
		System.out.println("克隆之后：");      //sring类型特殊
		Employee employee2=employee1.clone();
		employee2.getAddress().setState("中国");
		employee2.getAddress().setProvince("四川");
		employee2.getAddress().setCity("成都");
		employee2.setName("李四");
		employee2.setAge(24);
		System.out.println("员工1的信息");
		System.out.println(employee1);
		System.out.println("员工2的信息");
		System.out.println(employee2);
		address.setCity("非长春");
		System.out.println("员工1的信息");
		System.out.println(employee1);
		System.out.println("员工2的信息");
		System.out.println(employee2);
		employee2.setName("张三");
	}
}
