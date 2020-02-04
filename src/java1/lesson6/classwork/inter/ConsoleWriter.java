package java1.lesson6.classwork.inter;

public class ConsoleWriter implements Writer {

    @Override
    public void println(String message) {
        System.out.println(message);
    }
}