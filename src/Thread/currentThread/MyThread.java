package Thread.currentThread;

public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法的打印:"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印"+Thread.currentThread().getName());
    }
}

class test{
    public static void main(String[] args)
    {
        MyThread myThread= new MyThread();
        myThread.start();
    }
}

