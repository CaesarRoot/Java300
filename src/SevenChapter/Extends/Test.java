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
        //��̬ ���ܵ��ø���û�еķ���
        Employee manager0=new Manager();
        manager0.setName("Test");
        //manager0.setBonus(2000);
        System.out.println("��������:"+manager0.getName());
        //System.out.println("������:"+manager0.getBonus());


        System.out.println("Ա������:"+employee.getName());
        System.out.println("Ա������:"+employee.getSalary());
        System.out.println("Ա������:"+employee.getBirthday());
        System.out.println("��������:"+manager.getName());
        System.out.println("������:"+manager.getSalary());
        System.out.println("��������:"+manager.getBirthday());
        System.out.println("������:"+manager.getBonus());
    }
}
