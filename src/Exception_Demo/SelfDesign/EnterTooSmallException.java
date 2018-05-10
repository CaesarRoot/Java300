package Exception_Demo.SelfDesign;

public class EnterTooSmallException extends Exception {
    public EnterTooSmallException() {
        super();
    }
    public EnterTooSmallException(String msg) {
        super(msg);
    }
    public EnterTooSmallException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        System.out.println("Shits");
    }
}