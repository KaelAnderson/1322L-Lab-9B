package com.company;

import java.util.Scanner;

public class Main {
    public static String repeatNTimes(String input1,int input2){
        if(input2<0)
        {
            return "";
        }
        if(input2 == 1){
            return input1;
        }
        return input1 + repeatNTimes(input1,input2-1);
    }
    public static boolean isReverse(String word1, String word2) {
        if (word1 == "" || word2 == "") {
            return true;
        }
        if (word1.length() == 1 && word2.length() == 1) {
            if (word1.charAt(0) == word2.charAt(0)){
                return true;
            }else {
                return false;
            }
        } else if (word1.length() == word2.length()) {
            if (word1.charAt(0) == word2.charAt(word2.length() - 1)) {
                String firstWord = word1.substring(1, word1.length());
                String secondWord = word2.substring(0, word2.length() - 1);
                return isReverse(firstWord, secondWord);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));
        System.out.println("Enter the first string");
        String firstString = scan.nextLine();
        System.out.println("Enter the second string");
        String secondString = scan.nextLine();
        if (isReverse(firstString,secondString)){
            System.out.println(firstString + " is the reverse of " + secondString);
        }else {
            System.out.println(firstString + " is not the reverse of " + secondString);
        }
    }
}
