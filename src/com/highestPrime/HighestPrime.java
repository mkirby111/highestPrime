package com.highestPrime;

/**
 * This class calculates the highest prime number possible (given its algorithm and implementation).
 * The program runs for an exact duration and displays the highest prime number found at given intervals
 * throughout its progress. When completed, the highest prime number is displayed.
 */
public class HighestPrime {
    private static long time = System.currentTimeMillis();
    private static long duration = 60000;  //60 seconds
    private static long totalTime =  time + duration;

    /**
     * Main class runs the program for the given duration and displays the final results
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) {
        int maxPrime = 2;
        int num = 1;

        while (System.currentTimeMillis() <= totalTime) {
            int previousMaxPrime = maxPrime;
            if (isPrime(num) == true)
                maxPrime = num;
            if ((System.currentTimeMillis()%1000 == 0) && (previousMaxPrime < maxPrime))
                printProgress(maxPrime);
            num++;
        }
        printFinal(maxPrime, getElapsedTime());
    }

    /**
     * Function to display the final results
     * @param maxPrime
     * @param seconds
     */
    private static void printFinal(int maxPrime, int seconds) {
        System.out.println("===============================================");
        System.out.println("Total Time: " +  seconds + " seconds");
        System.out.println("Highest Prime: " + maxPrime);
        System.out.println("===============================================");
    }

    /**
     * Function to display the progress of the calculated highest prime number
     * @param maxPrime
     */
    private static void printProgress(int maxPrime) {
        System.out.println("Time: " + getElapsedTime() + " seconds\t\t" + "Highest Prime: " + maxPrime);
    }

    /**
     * Function to get the elapsed time in seconds
     * @return int
     */
    private static int getElapsedTime() {
        return (int) ((System.currentTimeMillis()-time)/1000);
    }

    /**
     * Function that returns a boolean value: true if the parameter number is prime; false if not
     * NOTE: this code was written using the "Sieve of Eratosthenes" algorithm as reference
     * (from "Introduction to The Design and Analysis of Algorithms" by Anany Levitin).
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        //check for negative, 0, or 1
        if (n<=1) return false;
            //check for 2 or 3
        else if (n <= 3) return true;
            //check if multiple of 2
        else if (n%2==0) return false;
        //check the odds greater than 3
        for (int i = 3; i*i<=n; i+=2)
            if (n%i==0) return false;
        return true;
    }
}
