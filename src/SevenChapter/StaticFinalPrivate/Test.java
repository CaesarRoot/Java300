package SevenChapter.StaticFinalPrivate;

public class Test {
    public static void main(String[] args)
    {
        Father son=new Son();
        //son.Private();      private类外不能调用
        son.Static();
        son.Final();
    }
}
