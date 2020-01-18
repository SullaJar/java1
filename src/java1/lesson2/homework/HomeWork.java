package java1.lesson2.homework;


public class HomeWork {

    /* Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        static void invertArray() {
            int [] a = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.print("Before:" );
            for ( int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            System.out.print("After: " );
            for ( int i = 0; i < a.length; i++) {
                if (a[i] == 0) a[i] = 1;
                else a[i] = 0;
                System.out.print(a[i] + " ");
            }

        }

    public static void main(String[] args) {
        invertArray();
    }
}
