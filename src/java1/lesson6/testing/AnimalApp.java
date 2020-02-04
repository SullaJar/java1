package java1.lesson6.testing;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat(1,2);
        Cat cat = new Cat(1,2);
        BombeyCat bombeyCat = new BombeyCat(1,2,3);
        Dog dog = new Dog (1);

        animal.voice();
        cat.voice();
        bombeyCat.voice();
        dog.voice();

        Animal animal1 = new Cat(1,2);
        animal1.voice();
        if (animal instanceof Cat) {
            ((Cat)animal).methodfromCatclass();
            System.out.println("В animal действительно лежит кот");
        }











        /*Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Барсик", "Серый");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        animal.jump();*/


    }


}

