import Exception_Demo.ThrowException;

public class ThrowsException {
    public static void throwException(int a){
        if (a ==1)
        throw new UnsupportedOperationException("Undo");
    }
    public static void main(String[] args){
int a = 1;
           ThrowsException.throwException(a);

    }
}