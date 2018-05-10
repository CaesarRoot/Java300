package SevenChapter.Override;

public class Test {
    public static void main(String[] args)
    {
        Employee employee=new Employee();
        System.out.println(employee.getInfo());
        Manager manager=new Manager();
        System.out.println(manager.getInfo());
    }
}
