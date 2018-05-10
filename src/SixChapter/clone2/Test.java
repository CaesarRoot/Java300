package SixChapter.clone2;

import java.io.*;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("序列化之前：");
        Address address= new Address("中国","吉林","长春");
        Employee employee1= new Employee("张三",30,address);
        System.out.println("员工1的信息:");
        System.out.println(employee1);
        System.out.println("序列化之后:");
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
            employee2.getAddress().setState("中国");
            employee2.getAddress().setProvince("四川");
            employee2.getAddress().setCity("成都");
            employee2.setName("李四");
            employee2.setAge(24);
            System.out.println("员工1的信息:");
            System.out.println(employee1);
            System.out.println("员工1的信息");
            System.out.println(employee2);
        }
    }
}
