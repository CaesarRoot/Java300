package SevenChapter.Extends;

import java.util.Date;

public class Test {
    public static void main(String[] args)
    {
        Employee employee=new Employee();
        employee.setName("Java");
        employee.setSalary(100);
        employee.setBirthday(new Date());
        Manager manager=new Manager();
        manager.setName("shits");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);
        //多态 不能调用父类没有的方法
        Employee manager0=new Manager();
        manager0.setName("Test");
        //manager0.setBonus(2000);
        System.out.println("经理姓名:"+manager0.getName());
        //System.out.println("经理奖金:"+manager0.getBonus());


        System.out.println("员工姓名:"+employee.getName());
        System.out.println("员工工资:"+employee.getSalary());
        System.out.println("员工生日:"+employee.getBirthday());
        System.out.println("经理姓名:"+manager.getName());
        System.out.println("经理工资:"+manager.getSalary());
        System.out.println("经理生日:"+manager.getBirthday());
        System.out.println("经理奖金:"+manager.getBonus());
    }
}
