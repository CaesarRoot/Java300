package FuncInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test1ForFunc {
    public int x = 20;

    public static void main(String[] args){
        Test1ForFunc test1 = new Test1ForFunc();
        test1.start();
    }

    public void setX(int x){
        this.x = x;
    }

    public void add(int x, Function<Integer, Integer> action){  //传入add函数 实际打印出 x+1
        System.out.println(action.apply(x));
    }

    public static int addone(int x){
        return x+1;
    }

    public void effectivelyfinal(){
        Test1ForFunc test1ForFunc = new Test1ForFunc();
        test1ForFunc.setX(500);
        Consumer<Integer> p = (y) -> System.out.println(test1ForFunc.x);
        p.accept(5);
    }

    public void start(){
        Test1ForFunc test2 = new Test1ForFunc();
        test2.add(99, Test1ForFunc::addone);
        test2.add(100, x -> addone(x));
        test2.add(101, x -> x+1);
        test2.add(102, new addOne());
        test2.effectivelyfinal();
    }

    class addOne implements Function<Integer, Integer>{
        @Override
        public Integer apply(Integer integer) {
            return integer + 1;
        }
    }
}
