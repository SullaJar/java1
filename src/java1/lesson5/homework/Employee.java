package java1.lesson5.homework;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        if (age > 18){
            this.age = age;
        } else {
            System.out.println( "Введён некорректный возраст. Мы не используем детский труд!");
        }

    }


    public void printInfo () {
        System.out.println( "Имя пользователя: " + name + "; Должность: " + position + "; email: " + email +
                "; Номер телефона: " + phoneNumber + "; Оклад: " + salary + "; Возраст: " + age);
    }

    /*public void setAge(int age) {
        if (age > 18){
            this.age = age;
        } else {
            System.out.println( "Введён некорректный возраст. Мы не используем труд детей ");
        }
    }*/

    public int getAge() {
        return age;
    }





    /*public ArrayList<Person> filterBiggerThan40(Person [] people) {
        // TODO: 28.01.2020
        return null;
    }*/
}
