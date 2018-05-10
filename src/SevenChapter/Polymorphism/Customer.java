package SevenChapter.Polymorphism;

public class Customer {
    public static void main(String[] args)
    {
        System.out.println("顾客要购买BMW:");
        Car bmw=CarFactory.getCar("BMW");
        System.out.println("提取汽车:"+bmw.getInfo());//动态绑定.private不能继承无多态 final可继承不能重写 static可继承但是重写会被隐藏
        System.out.println("顾客要购买Benz:");
        Car benz=CarFactory.getCar("Benz");
        System.out.println("提取汽车:"+benz.getInfo());
    }
}
