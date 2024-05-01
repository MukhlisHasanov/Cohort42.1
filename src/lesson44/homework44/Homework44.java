package lesson44.homework44;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * AIT-TR, Cohort42.1, Java Basic Homework #44
 * @author Muklis Hasanov
 * @version 01-May-24
 */
public class Homework44 {
    public static void main(String[] args) {
        String inputFileName = "transactions.txt";
        String lessOutputFileName = "less.txt";
        String moreOutputFileName = "more.txt";

        Map<String, Integer> userTransactions = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String user = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    userTransactions.merge(user, amount, Integer::sum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter lessWriter = new BufferedWriter(new FileWriter(lessOutputFileName));
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(moreOutputFileName))) {

            for (Map.Entry<String, Integer> entry : userTransactions.entrySet()) {
                String user = entry.getKey();
                int totalAmount = entry.getValue();

                if (totalAmount < 2000) {
                    lessWriter.write(user + ":" + totalAmount + "\n");
                } else {
                    moreWriter.write(user + ":" + totalAmount + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The processing result is written in less.txt and more.txt");
    }
}
