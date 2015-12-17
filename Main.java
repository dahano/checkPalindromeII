package com.ofirdahan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring our scanner function so we can take in the string from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user for input
        System.out.println("Please enter in a word: ");

        //Storing user input into a String object
        String originalWord = scanner.nextLine().toLowerCase();

        //Declaring our StringBuilder
        StringBuilder reversedWord = new StringBuilder();

        //Telling the StringBuilder object to append our String
        reversedWord = reversedWord.append(originalWord.toLowerCase());

        //Calling the reverse() method on our stringBuilder
        reversedWord.reverse();

        //Calling the toString() method on our StringBuilder so that we can do a comparison to our original word and printing out results
        if(reversedWord.toString().equals(originalWord)){
            System.out.println("Congratulations! this word is a palindrome");
        }else{
            System.out.println("Sorry, this word is not a palindrome!");
        }

        System.out.println("original word: "+ originalWord + "\n"+ "reversed Word: " + reversedWord + "\n");

    }
}
