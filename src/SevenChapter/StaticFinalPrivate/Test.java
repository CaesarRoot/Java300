package SevenChapter.StaticFinalPrivate;

public class Test {
    public static void main(String[] args)
    {
        Father son=new Son();
        //son.Private();      private���ⲻ�ܵ���
        son.Static();
        son.Final();
    }
}
