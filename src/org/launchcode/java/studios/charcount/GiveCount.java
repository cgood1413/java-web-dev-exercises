package org.launchcode.java.studios.charcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GiveCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text to count the characters of: ");
        char[] charsInString = input.nextLine()
                .toUpperCase()
                .toCharArray();
        input.close();
        HashMap<Character, Integer> charCount = CountChars.getChars(charsInString);

        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
