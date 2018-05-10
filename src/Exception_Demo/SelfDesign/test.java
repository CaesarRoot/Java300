package Exception_Demo.SelfDesign;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = Integer.parseInt(sb.nextLine());
        try {
            if (a < 3) {
                throw new EnterTooSmallException("Too small", null, false, false);
            } else {
                System.out.println(a);
            }
        }catch (EnterTooSmallException e){
            e.printStackTrace();
            }
    }
}
