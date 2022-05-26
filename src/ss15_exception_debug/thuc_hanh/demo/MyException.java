package ss15_exception_debug.thuc_hanh.demo;

public class MyException extends Exception {

    public MyException(String message) {
        System.out.println(message);
    }

}
