package Thread.Save;

public class test {
    public static void main(String[] args)
    {
        try {
            ALogin a = new ALogin();
            a.start();
            Thread.sleep(1000);
            BLogin b = new BLogin();
            b.start();
        }catch (InterruptedException e) {e.printStackTrace();}
    }
}
