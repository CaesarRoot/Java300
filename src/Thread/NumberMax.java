package Thread;

public class NumberMax {
    public static void main(String[] args){
        System.out.println(NumberMax.maxnumber(3, 5, 20, -10));
    }

    public static double maxnumber(double... a){
        double max = Double.MIN_VALUE;
        for(double b: a){
            if(b>max){
                max = b;
            }
        }
        return max;
    }
}
