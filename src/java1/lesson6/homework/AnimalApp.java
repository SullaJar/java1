package java1.lesson6.homework;

public class AnimalApp {
    public static void main(String[] args) {

        Cat cat = new Cat(200,2,0);

        Dog dog = new Dog(500,0.5, 10);

        System.out.println( cat.run(100));

        System.out.println(dog.jump(10));


    }
}
