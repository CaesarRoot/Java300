package SixChapter.clone;

public class Test {
	public static void main(String[] args)
	{
		Address address=new Address("�й�","����","����");
		Employee employee1=new Employee("����",30,address);
		System.out.println("Ա��1����Ϣ");
		System.out.println(employee1);
		System.out.println("��¡֮��");      //sring��������
		Employee employee2=employee1.clone();
		employee2.getAddress().setState("�й�");
		employee2.getAddress().setProvince("�Ĵ�");
		employee2.getAddress().setCity("�ɶ�");
		employee2.setName("����");
		employee2.setAge(24);
		System.out.println("Ա��1����Ϣ");
		System.out.println(employee1);
		System.out.println("Ա��2����Ϣ");
		System.out.println(employee2);
		address.setCity("�ǳ���");
		System.out.println("Ա��1����Ϣ");
		System.out.println(employee1);
		System.out.println("Ա��2����Ϣ");
		System.out.println(employee2);
		employee2.setName("����");
	}
}
