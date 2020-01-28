package java1.lesson4.homework;

import java.util.Scanner;
import java.util.Random;

public class CrossZero {

    /*Создание игрового поля. Для указания размера поля и количества фишек для победы
    добавим две константы SIZE и DOTS_TO_WIN.
     */
    public static char[][] map;
    public static final int SIZE = 3;
   // public static final int DOTS_TO_WIN = 3;


    //Ячейки поля. Чтобы не забыть, какой символ за что отвечает, их можно записать в именные константы.

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    /*Инициализация поля. При запуске программы необходимо инициализировать поле и заполнить
     все его ячейки символом, обозначающим пустое поле.
     */

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //Вывод поля в консоль. Проинициализированное поле готово. Теперь необходимо вывести его в консоль.

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Ход человека. Теперь можно сделать метод, отвечающий за ход человека-игрока.

    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    //Проверка ячеек. Метод isCellValid() проверяет возможность установки фишки в указанную ячейку.

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    /*Ход компьютера. Для реализации хода компьютера достаточно чуть изменить метод хода игрока,
    добавив туда генератор случайных чисел.
     */

    public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    //Проверка победы. Необходимо проверить все выигрышные комбинации. Если хотя бы одна будет найдена, вернуть true.

    /*public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
     }*/


    static boolean checkWin (char s) {
        for (int i = 0; i < SIZE; i++) {
            int sX = 0, sY = 0, dS1 = 0, dS2 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == s) {
                    sX++;
                    if (sX == SIZE) return true;
                }

                if (map[j][i] == s) {
                    sY++;
                    if (sY == SIZE) return true;
                }

                if (map[j][j] == s) {
                    dS1++;
                    if (dS1 == SIZE) return true;
                }

                if (map[j][2 - j] == s) {
                    dS2++;
                    if (dS1 == SIZE) return true;
                }

            }
        }
        return false;
    }




    // Проверка на заполнение поля
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
