package java1.lesson1.homework;

public class HomeWork {
    public static void main(String[] args) {
        // Создать переменные всех пройденных типов данных и инициализировать их значения.
        int q, z, y;
        q = z = y = 2;
        int w = q + z * y;
        System.out.println("d = " + w);

        final float num = 20.20f;
        System.out.println("num = " + num);

        double flat = 12.146, height = 6.345;
        double square = 0.5 * flat / height;
        System.out.println("Площадь треугольника = " + square);

        boolean god = false;
        System.out.println("God - " + god);

        // ниже в каждой новой строке начинается реализация методов, который возвращают результат в метод main



        System.out.println(count(3, 4, 10, 25));

        System.out.println(checkSum(5, 5));

        System.out.println(print(5));

        System.out.println(comparison(-1));

        System.out.println(printName("Sulla"));

        System.out.println("2019 год високосный: " +  leapYear(2019));

        System.out.println("Testing GIT WTF");

        System.out.println("Test with Amigocode");
    }


    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
    */
    public static float count(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }


    /*
    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean checkSum(int num1, int num3) {
        int c = num1 + num3;
        if ((c >= 10) && (c <= 20)) {
            return (true);
        } else {
            return (false);
        }

    }


        /*
        Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
         */

    public static String print(int number) {
        if (number < 0) {
            return ("Передано отрицательное число ");
        } else {
            return ("Передано положительное число");
        }

    }

        /*Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное.
         */

    public static boolean comparison(int j) {
        if (j < 0) {
            return true;
        }

        return false;
    }


        /*Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
                 */



    public static String printName(String name) {
        return name;
    }

    // void print -> sout(name)



    /*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static boolean leapYear(int year){
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 !=0))
            return true;
        else
            return false;

    }

}
