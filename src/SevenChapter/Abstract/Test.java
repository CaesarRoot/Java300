package SevenChapter.Abstract;

public class Test {
    public static void main(String[] args)
    {
        Circle circle=new Circle(1);
        System.out.println("ͼ�ε�������:"+circle.getName());
        System.out.println("ͼ�ε������:"+circle.getArea());
        Rectangle rectangle=new Rectangle(1,1);
        System.out.println("ͼ�ε������ǣ�"+rectangle.getName());
        System.out.println("ͼ�ε������:"+rectangle.getArea());
    }
}
