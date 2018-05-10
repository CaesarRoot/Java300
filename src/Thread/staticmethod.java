package Thread;

public class staticmethod {
    public static void main(String[] args){
        father.run();
        son.run();
    }
}

class father{
    public static void run(){
        System.out.println("father");
    }
}

class son extends father{
    public static void run(){
        System.out.println("son");
    }
}
