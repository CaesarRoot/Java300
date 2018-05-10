public class returnInnerClass {
    int x = 100;

    class inner{
        public void countdown(){
            returnInnerClass.this.x = returnInnerClass.this.x - 1 ;
        }
    }

    public inner getinner(){
        return new inner();
    }

    public static void main(String[] args){
        returnInnerClass test = new returnInnerClass();
        test.start();
    }

    public void start(){
        returnInnerClass returnInnerClass1 = new returnInnerClass();
        returnInnerClass.inner inner = returnInnerClass1.getinner();
        inner.countdown();
        System.out.print(returnInnerClass1.x);
    }
}
