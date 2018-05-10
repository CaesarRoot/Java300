package SevenChapter.Abstract;

public abstract class Shape {
    public String getName()
    {
        return this.getClass().getSimpleName();//前一个返回此 Object 的运行时类.后一个返回源代码中给出的底层类的简称。
    }
    public abstract double getArea();    //子类（如果不是抽象类）则必须覆写抽象类之中的全部抽象方法（如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。）
}
