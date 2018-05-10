package Thread.stop;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 500000; i++){
            System.out.println("i="+(i+1));
        }
    }
}

/*
class Run{
    public static void main(String[] args){
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e) {e.printStackTrace();}
    }
}
*/

/*
class Run{
    public static void main(String[] args){
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("ÊÇ·ñÍ£Ö¹1£¿"+thread.interrupted());
            System.out.println("ÊÇ·ñÍ£Ö¹2£¿"+thread.interrupted());
        }catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("End!");
    }
}
*/


class Run{
    public static void main(String[] args){
        Thread.currentThread().interrupt();
        System.out.println("stop1?"+Thread.interrupted());
        System.out.println("stop2?"+Thread.interrupted());
        System.out.println("End!");
    }
}
