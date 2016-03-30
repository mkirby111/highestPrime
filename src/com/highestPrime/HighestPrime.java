package com.highestPrime;

/**
 * Created by mkirby on 3/29/16.
 */
public class HighestPrime {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long duration = 5000;
        long totalTime =  startTime + duration;
        int seconds = 0;

        while (System.currentTimeMillis() <= totalTime) {
            System.out.println("Time: " + seconds + " seconds");
            Thread.sleep(1000);
            seconds++;
        }
        System.out.println("Total Time: " +  seconds + " seconds");
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
