package SevenChapter.Comparable;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Employee o)
    {
        return Integer.compare(id,o.id);
    }

    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("员工编号:"+id+",");
        sb.append("员工姓名:"+name+",");
        sb.append("员工年龄:"+age);
        return sb.toString();
    }
}
