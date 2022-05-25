package ss15_exception_debug.bai_tap;

public class MyException extends Exception{
    public MyException(String message) {
        System.out.println(message);
    }
}
