package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW12 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scanner.nextLine();
        word = word.trim();
        System.out.println("w1: " + word);
        String reverseWord = "";

        int strLength = word.length();

        for (int i = (strLength - 1); i >=0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println(word + " is a Palindrome.");
        }
        else {
            System.out.println(word + " is not a Palindrome.");
        }

    }
}

