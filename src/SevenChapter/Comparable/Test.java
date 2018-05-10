package SevenChapter.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args)
    {
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(3,"Java",21));
        list.add(new Employee(2,"Java",22));
        list.add(new Employee(1,"Java",23));
        System.out.println("����ǰ:");
        for(Employee employee:list)
        {
            System.out.println(employee);
        }
        System.out.println("�����:");
        Collections.sort(list);         //�б�����Collection.sort���� ��������Arrays.sort����
        for(Employee employee:list)
        {
            System.out.println(employee);
        }
    }
}
