package com.practiceprimenumbers.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations
        int number = 0;
        boolean isPrime = true;

        //Implements scanner
        Scanner In = new Scanner(System.in);

        //Input from user
        System.out.print("Write the number: ");
        number = In.nextInt();

        //Process
        /*
            --Example process with number 5--

            number = 5
            i = 2
            5 mod i = 1

            i = 3
            5 mod i = 1

            i = 4
            5 mod i = 1

            i = 5
            5 mod i = 0

        */

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        //Output results
        System.out.println(number+" is "+isPrime);

        //Close input
        In.close();
    }
}
