package lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomWordGame {
    public static void main(String[] args) {
        try {
            // Load words from file
            List<String> words = loadWordsFromFile("C:\\Users\\muxlis.hesenov\\IdeaProjects\\Cohort42.1\\src\\lesson7\\words.txt");

            // Check if there are words in the file
            if (words.isEmpty()) {
                System.out.println("File does not contain any words.");
                return;
            }

            // Ask user for the word length
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the word length: ");
            int wordLength = scanner.nextInt();

            // Find and select a random word of the specified length
            String targetWord = findRandomWordByLength(words, wordLength);
            if (targetWord == null) {
                System.out.println("No word of length " + wordLength + " found.");
                return;
            }

            // Initialize an array to track guessed letters
            char[] guessedLetters = new char[wordLength];
            for (int i = 0; i < wordLength; i++) {
                guessedLetters[i] = '_';
            }

            // Game loop
            int attempts = 5; // Number of attempts
            while (attempts > 0) {
                System.out.println("Guess the word: " + new String(guessedLetters));

                System.out.print("Enter a letter: ");
                char guess = scanner.next().charAt(0);

                // Check if the guessed letter is in the word
                boolean found = false;
                for (int i = 0; i < wordLength; i++) {
                    if (targetWord.charAt(i) == guess) {
                        guessedLetters[i] = guess;
                        found = true;
                    }
                }

                if (!found) {
                    attempts--;
                    System.out.println("Incorrect! Attempts left: " + attempts);
                } else {
                    System.out.println("Correct!");
                }

                // Check if the word has been completely guessed
                if (new String(guessedLetters).equals(targetWord)) {
                    System.out.println("Congratulations! You guessed the word: " + targetWord);
                    break;
                }
            }

            if (attempts == 0) {
                System.out.println("Out of attempts. The target word was: " + targetWord);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to load words from a file into a list
    private static List<String> loadWordsFromFile(String filename) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        return words;
    }

    // Method to find a random word of specified length
    private static String findRandomWordByLength(List<String> words, int length) {
        // Filter words by length
        List<String> wordsOfLength = new ArrayList<>();
        for (String word : words) {
            if (word.length() == length) {
                wordsOfLength.add(word);
            }
        }

        // If there are words of the specified length, select a random one
        if (!wordsOfLength.isEmpty()) {
            Random random = new Random();
            return wordsOfLength.get(random.nextInt(wordsOfLength.size()));
        } else {
            return null;
        }
    }
}
