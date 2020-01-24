package java1.lesson3.homework;

import java.util.Scanner;

public class Guess {


    static void checkAnswers() {

        int answer = (int) (Math.random() * 9);
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + "." + " Введите число");

            int userAnswer = sc.nextInt();

            if (userAnswer == answer) {
                System.out.println("Поздравляю вы победили! Повторить игру ещё раз: 1- да, 0 - нет?");
                int q = sc.nextInt();
                if (q == 1) checkAnswers();
                    else {
                    System.out.println("Спасибо за игру");
                    System.exit(0);
                }
            }

            if (userAnswer < answer) {
                System.out.println("Загаданное число больше ");
            }

            if (userAnswer > answer) {
                System.out.println("Загаданное число меньше ");
            }


        }

        System.out.println("Вы проиграли");
        System.out.println("Повторить игру ещё раз: 1- да, 0 - нет?");
        int q = sc.nextInt();
        if (q == 1) checkAnswers();
        else {
            System.out.println("Спасибо за игру");
            System.exit(0);
        }
    }


    public static void main(String[] args) {

        System.out.println("Отгадайте число от 0 до 9. У вас три попытки. ");

        checkAnswers();


    }

}






