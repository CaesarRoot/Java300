package Thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}

class Run{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Over");
    }
}