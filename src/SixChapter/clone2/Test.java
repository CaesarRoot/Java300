package SixChapter.clone2;

import java.io.*;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("���л�֮ǰ��");
        Address address= new Address("�й�","����","����");
        Employee employee1= new Employee("����",30,address);
        System.out.println("Ա��1����Ϣ:");
        System.out.println(employee1);
        System.out.println("���л�֮��:");
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        Employee employee2=null;
        try
        {
            out=new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(employee1);
            in=new ObjectInputStream(new FileInputStream("employee.dat"));
            employee2=(Employee)in.readObject();
            out.close();
            in.close();
        }
        catch(IOException |ClassNotFoundException e) {e.printStackTrace();}

        if(employee2 != null)
        {
            employee2.getAddress().setState("�й�");
            employee2.getAddress().setProvince("�Ĵ�");
            employee2.getAddress().setCity("�ɶ�");
            employee2.setName("����");
            employee2.setAge(24);
            System.out.println("Ա��1����Ϣ:");
            System.out.println(employee1);
            System.out.println("Ա��1����Ϣ");
            System.out.println(employee2);
        }
    }
}
