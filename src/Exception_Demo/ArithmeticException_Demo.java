package Exception_Demo;

public class ArithmeticException_Demo {
    public static void main(String[] args){
        System.out.println("-1.0/0="+(-1.0/0));
        System.out.println("+1.0/0="+(+1.0/0));
        try{
            System.out.println("-1/0="+(-1/0));
        }catch(Exception e) {
            System.out.println("exception " + e.getMessage());
        }
        System.out.println("-1/0="+(-1/0));
    }
}
