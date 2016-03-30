package com.highestPrime;

/**
 * Created by mkirby on 3/29/16.
 */
public class HighestPrime {
    private static long startTime = System.currentTimeMillis();
    private static long duration = 5000;
    private static long totalTime =  startTime + duration;
    private static int seconds = 0;
    private static int num = 1;

    public static void main(String[] args) throws InterruptedException {
        int maxPrime = 2;

        while (System.currentTimeMillis() <= totalTime) {
            if (isPrime(num) == true)
                maxPrime =num;
            printProgress(maxPrime);
            num++;
        }
        System.out.println("\n======================================================\n");
        System.out.println("Total Time: " +  seconds + " seconds");
        System.out.println("Highest Prime: " + maxPrime);
    }

    private static void printProgress(int maxPrime) throws InterruptedException {
            System.out.println("Time: " + seconds + " seconds\t" + "Highest Prime: " + maxPrime);
            Thread.sleep(1000);
            seconds++;
    }

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
