package Exception_Demo;

public class ThrowException {
    public static void throwException(){
        throw new UnsupportedOperationException("Undo");
    }
    public static void main(String[] args){
        try{
            ThrowException.throwException();
        }catch (UnsupportedOperationException e){System.out.println(e.getMessage());}
        ThrowException.throwException();
    }
}
