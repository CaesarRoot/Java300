package Thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }
}

class text{
    public static void main(String[] args)
    {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Over");
    }
}
