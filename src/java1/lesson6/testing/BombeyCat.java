package java1.lesson6.testing;

public class BombeyCat extends Cat {

    private int c;

    public BombeyCat(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    void voice() {
        super.voice();
    }
}
