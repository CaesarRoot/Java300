package SevenChapter.Abstract;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    @Override    //���ࣨ������ǳ����ࣩ����븲д������֮�е�ȫ�����󷽷����������û��ʵ�ָ���ĳ��󷽷�������뽫����Ҳ����ΪΪabstract�ࡣ��
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
