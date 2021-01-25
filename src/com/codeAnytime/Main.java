package com.codeAnytime;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the password");
       int guesPassword = scanner.nextInt();
        int password = 123456;
        if (guesPassword == password){
            System.out.println("You guess the correct password " + "which is " + guesPassword);
        }
        else {
            System.out.println("No, try again, " + "This "+ guesPassword + " is not correct");
            scanner.nextInt();
            System.out.println("You have no chance anymore! Come back after one hour!");
        }
    }
}
