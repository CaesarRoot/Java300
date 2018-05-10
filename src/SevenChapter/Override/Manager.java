package SevenChapter.Override;

public class Manager extends Employee{
    @Override    //此注释应用在方法上，如果没有重写则会报错
    public String getInfo()
    {
        return "子类，我是经理";
    }
}
