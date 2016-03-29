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
}
