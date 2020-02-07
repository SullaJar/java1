package java1.lesson7.homework;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(30);
        cat.catInfo();
        plate.info();
        cat.eat(plate);
        cat.catInfo();
        plate.info();
        //plate.setFood(plate.getFood()-cat.getAppetite());
    }
}
