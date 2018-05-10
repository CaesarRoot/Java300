package SevenChapter.StaticFinalPrivate;

public class Son extends Father{
    //@Override               private不能继承
    //public void Private()
    //{
    //    System.out.println("I'm son");
    //}

    //@Override       不能重写，实际上是隐藏，不具有多态性
    static void Static()
    {
        System.out.println("I'm son");
    }

    //@Override               final不能重写
    //public void Final()
    //{
    //    System.out.println("I'm son");
    //}
}
