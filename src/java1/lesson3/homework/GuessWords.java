package java1.lesson3.homework;

import java.util.Scanner;

public class GuessWords {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Запомните слова, которые появятся на экране");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        for (String s:words) System.out.print (s +  " " + " ");

        System.out.println();

        System.out.println("Попробуйте угадать какое слово загадал компьютер");

        int n = (int)(Math.random()*words.length);

        String answer = words[n];

        while (true){
            System.out.println("Введите ваш вариант слова");
            String userAnswer = sc.nextLine();

            if (answer.equals(userAnswer)) {
                System.out.println("Поздравляю! Вы угадали. Игра окончена");
                break;
            } else {
                String s = "";
                int minLength = Math.min(userAnswer.length(), answer.length());

                for (int i = 0; i < minLength; i++) {
                    if (userAnswer.charAt(i) != answer.charAt(i)) {
                        i = 10000000; // помогает выйти из цикла if и for
                        break;
                    } else {
                        s += userAnswer.charAt(i);
                    }
                }
                while (s.length() < 15) s += "#";
                System.out.println(s);

            }
        }


    }
}
