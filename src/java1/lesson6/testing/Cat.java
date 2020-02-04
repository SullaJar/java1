package java1.lesson6.testing;

public class Cat extends Animal {

    private int b;
    protected int z;

    public Cat(int a, int b) {
        super(a);
        this.b = b;
    }

    public void test () {

        z = 10;
        super.z = 20;

    }

    @Override
    void voice() {
        System.out.println("Кот мяукнул");
    }

    public void methodfromCatclass() {
    }



    /*String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo () {
        System.out.println( "Кот имя: " + name + " Цвет: " + color);
    }*/
}