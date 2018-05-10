package SevenChapter.Abstract;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    @Override    //子类（如果不是抽象类）则必须覆写抽象类之中的全部抽象方法（如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。）
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
