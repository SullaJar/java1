package java1.lesson6.classwork.constractors;

public class A {

    private int a;
    public int aI;

    public A(int a, int aI) {
        System.out.println("A was invoked");
        this.a = a;
        this.aI = aI;
    }

    public void printParam() {
        System.out.print(a + " " + aI);
    }
}
