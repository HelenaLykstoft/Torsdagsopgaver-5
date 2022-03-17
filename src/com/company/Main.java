package com.company;
import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/data.txt");
        scan = new Scanner(file);


        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);



        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    // Print longest word
    private static void printLongestWord(int l) {
        String longest_tmp = "";
        //int maxLength = longest_tmp.length();

        for (String s:text) {
            if (s.length() > longest_tmp.length()) {
                longest_tmp = s;
            }
            System.out.println(longest_tmp);
        }
        // Missing return type????

    }
}