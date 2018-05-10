package Anonymous;

public class Test1 {

    interface Hello{
        void run();
    }

    public static void main(String[] args){
        Hello hello = new Hello(){
            public void run(){
                System.out.println("Hello");
            }
        };
        hello.run();
    }
}
