package com.practiceprimenumbers.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations
        int inNumber = 0;
        int count = 0;
        int vectorPrimes[];

        //Implements scanner
        Scanner In = new Scanner(System.in);

        //Input from user
        System.out.print("Write the number: ");
        inNumber = In.nextInt();

        //Process
        vectorPrimes = new int[inNumber];
        for (int number = inNumber; number > 0; number--){
            //Validate the return.
            if(ValidatePrime(number)){
                vectorPrimes[count] = number;
                count++;
            }
        }

        //Output results
        System.out.println("The primes numbers are: ");
        for (int i = 0; i < count; i++){
           System.out.println(vectorPrimes[i]);
        }

        //Close input
        In.close();
    }

    //This function is valid if the number is prime
    public static boolean ValidatePrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
