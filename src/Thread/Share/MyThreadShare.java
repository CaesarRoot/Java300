package Thread.Share;

public class MyThreadShare extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("ÓÉ"+this.currentThread().getName()+"¼ÆËãcouont="+count);
    }
}

class test{
    public static void main(String[] args)
    {
        MyThreadShare myThread=new MyThreadShare();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}