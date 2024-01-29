package lesson7;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "banana", "orange", "grape", "melon"}; // список слов для угадывания
        String secretWord = words[(int) (Math.random() * words.length)]; // выбор случайного слова из списка
        int attemptsLeft = 6; // количество попыток
        StringBuilder guessedLetters = new StringBuilder(); // угаданные буквы

        System.out.println("Добро пожаловать в игру 'Виселица'!");
        System.out.println("У вас есть 6 попыток, чтобы угадать слово.");

        while (attemptsLeft > 0) {
            boolean allLettersGuessed = true;
            for (int i = 0; i < secretWord.length(); i++) {
                char letter = secretWord.charAt(i);
                if (guessedLetters.indexOf(Character.toString(letter)) != -1) {
                    System.out.print(letter);
                } else {
                    System.out.print("_");
                    allLettersGuessed = false;
                }
            }
            System.out.println();

            if (allLettersGuessed) {
                System.out.println("Поздравляем! Вы угадали слово: " + secretWord);
                break;
            }

            System.out.println("Введите букву:");
            char guess = scanner.next().charAt(0);

            if (secretWord.indexOf(guess) != -1) {
                guessedLetters.append(guess);
                System.out.println("Отлично! Эта буква есть в слове.");
            } else {
                System.out.println("К сожалению, такой буквы нет в слове.");
                attemptsLeft--;
                System.out.println("Осталось попыток: " + attemptsLeft);
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("Вы проиграли! Загаданное слово было: " + secretWord);
        }

        scanner.close();
    }
}

