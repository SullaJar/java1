package java1.lesson7.homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }



    //Чтобы кот мог взаимодействовать с тарелкой, в метод eat передадим в качестве параметра ссылку на объект класса Тарелка.
    public void eat(Plate p){
        full = p.decreaseFood(appetite);
    }

    public void catInfo (){
        System.out.println(name + " " + (full ? " сыт " : " голоден ") );

    }


}
