package SixChapter.clone2;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID=3049633059823371192L;
    private String name;
    private int age;
    private Address address;
    public Employee(String name, int age, Address address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public Address getAddress()
    {
        return address;
    }

    public String toString()
    {
        StringBuilder sb= new StringBuilder();
        sb.append("ĞÕÃû:"+name+"£¬");
        sb.append("ÄêÁä:"+age+"£¬");
        sb.append("µØÖ·:"+address);
        return sb.toString();
    }
}
