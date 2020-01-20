package java1.lesson2.homework;


public class HomeWork {

    /* Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        static void invertArray() {
            int [] a = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            System.out.print("Reverse array: " );
            for ( int i = 0; i < a.length; i++) {
                if (a[i] == 0) a[i] = 1;
                else a[i] = 0;
                System.out.print(a[i] + " ");
            }
        }


    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        static void fillArray() {
            int [] a = new int[8] ;
            System.out.print("New array: ");
            for (int i = 0; i< a.length; i++) {
                a[i] = i * 3;
                System.out.print(a[i] + " ");
            }
        }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        static void x2MaxArray () {
            int [] a = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1} ;
            System.out.print("X2 array: ");
            for (int i = 0; i<a.length; i++) {
               if (a[i] < 6) a[i]*=2;
                System.out.print(a[i] + " ");
            }
        }


    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

    static void twoDimensionalArray () {

        int [] [] table = new int [3] [3] ;

        for (int i = 0; i<table.length; i++) {
            for (int j = 0 ; j<table.length; j++) {
                if ((i==j) || (i == table.length - j - 1)) table[i][j] = 1;
                    else {
                        table[i][j] = 0;
                    }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        System.out.println("Task 1");
        invertArray();

        System.out.println();

        System.out.println("Task 2");
        fillArray() ;

        System.out.println();

        System.out.println("Task 3");
        x2MaxArray ();

        System.out.println();

        System.out.println("Task 4");
        twoDimensionalArray ();
    }
}
