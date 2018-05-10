package Thread.randomThread;

public class test{
    public static void main(String[] args)
    {
        try {
            randomThread thread = new randomThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.print("main=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {e.printStackTrace();}
    }
}
