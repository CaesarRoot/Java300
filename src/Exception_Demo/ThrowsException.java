package Exception_Demo;

public class ThrowsException {
    public static void throwsException(int a) throws ClassNotFoundException{
        if(a==1){
            Class.forName("shits");
        }
        else
            Class.forName("Exception_Demo.ThrowsException");
    }

    public static void main(String[] args){
        try{
            ThrowsException.throwsException(1);
        }catch (ClassNotFoundException e) {e.printStackTrace();}
        //ThrowsException.throwsException(0);  //±ØÐëÉùÃ÷
    }
}
