package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        //first set of numbers
        System.out.println("Enter some letters");
        String letters1 = input.next();
        char indexLetters1 = letters1.charAt(0);

        //second set of numbers
        System.out.println("Enter a second set of letters");
        String letters2 = input.next();
        char indexLetters2 = letters2.charAt(0);

        //third set of numbers
        System.out.println("Enter a third set of letters");
        String letters3 = input.next();
        char indexLetters3 = letters3.charAt(0);

        System.out.print(indexLetters1 + "" + letters1.length());
        System.out.print(indexLetters2 + "" + letters2.length());
        System.out.print(indexLetters3 + "" + letters3.length());
    }
}
